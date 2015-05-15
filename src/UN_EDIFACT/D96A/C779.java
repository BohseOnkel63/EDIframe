package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C779 {
    private final String Tag = "C779";
    private final String Description = "ARRAY STRUCTURE IDENTIFICATION";
    private final String LongDescription = "The identification of an array structure.";
    private Boolean Mandatory;


    public E9428 e9428 = new E9428();
    public E7405 e7405 = new E7405();


    public C779() {
        e9428.setMandatory(true);
    }


    public C779(Boolean Mandatory, String s9428, String s7405) {
        this.Mandatory = Mandatory;
        e9428.setContent(s9428);
        e9428.setMandatory(true);
        e7405.setContent(s7405);
    }


    public void validate() throws ValidityException {
        try {
            e9428.validate();
            e7405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9428.toString() + ":" + e7405.toString();
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

