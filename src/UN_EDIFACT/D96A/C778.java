package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C778 {
    private final String Tag = "C778";
    private final String Description = "POSITION IDENTIFICATION";
    private final String LongDescription = "To identify the position of an object in a structure containing the object.";
    private Boolean Mandatory;


    public E7164 e7164 = new E7164();
    public E1050 e1050 = new E1050();


    public C778() {
    }


    public C778(Boolean Mandatory, String s7164, String s1050) {
        this.Mandatory = Mandatory;
        e7164.setContent(s7164);
        e1050.setContent(s1050);
    }


    public void validate() throws ValidityException {
        try {
            e7164.validate();
            e1050.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7164.toString() + ":" + e1050.toString();
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

