package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C785 {
    private final String Tag = "C785";
    private final String Description = "STATISTICAL CONCEPT IDENTIFICATION";
    private final String LongDescription = "The identification of a statistical concept.";
    private Boolean Mandatory;


    public E6434 e6434 = new E6434();
    public E7405 e7405 = new E7405();


    public C785() {
        e6434.setMandatory(true);
    }


    public C785(Boolean Mandatory, String s6434, String s7405) {
        this.Mandatory = Mandatory;
        e6434.setContent(s6434);
        e6434.setMandatory(true);
        e7405.setContent(s7405);
    }


    public void validate() throws ValidityException {
        try {
            e6434.validate();
            e7405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6434.toString() + ":" + e7405.toString();
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

