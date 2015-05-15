package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C818 {
    private final String Tag = "C818";
    private final String Description = "PERSON INHERITED CHARACTERISTIC DETAILS";
    private final String LongDescription = "To specify an inherited characteristic of a person.";
    private Boolean Mandatory;


    public E3311 e3311 = new E3311();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3310 e3310 = new E3310();


    public C818() {
    }


    public C818(Boolean Mandatory, String s3311, String s1131, String s3055, String s3310) {
        this.Mandatory = Mandatory;
        e3311.setContent(s3311);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3310.setContent(s3310);
    }


    public void validate() throws ValidityException {
        try {
            e3311.validate();
            e1131.validate();
            e3055.validate();
            e3310.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3311.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3310.toString();
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

