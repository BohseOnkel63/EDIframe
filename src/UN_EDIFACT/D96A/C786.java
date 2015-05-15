package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C786 {
    private final String Tag = "C786";
    private final String Description = "STRUCTURE COMPONENT IDENTIFICATION";
    private final String LongDescription = "The identification of a structure component.";
    private Boolean Mandatory;


    public E7512 e7512 = new E7512();
    public E7405 e7405 = new E7405();


    public C786() {
        e7512.setMandatory(true);
    }


    public C786(Boolean Mandatory, String s7512, String s7405) {
        this.Mandatory = Mandatory;
        e7512.setContent(s7512);
        e7512.setMandatory(true);
        e7405.setContent(s7405);
    }


    public void validate() throws ValidityException {
        try {
            e7512.validate();
            e7405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7512.toString() + ":" + e7405.toString();
        return EdiFunctions.trim(output);
    }

    public String getTag() {
        return this.Tag;
    }

    public String getDescription() {
        return this.Description;
    }

    public String getLongDescription() {
        return this.LongDescription;
    }

    public void setMandatory(Boolean Mandatory) {
        this.Mandatory = Mandatory;
    }

    public Boolean getMandatory() {
        return this.Mandatory;
    }

}

