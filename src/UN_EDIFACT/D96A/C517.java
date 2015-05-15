package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C517 {
    private final String Tag = "C517";
    private final String Description = "LOCATION IDENTIFICATION";
    private final String LongDescription = "Identification of a location by code or name.";
    private Boolean Mandatory;


    public E3225 e3225 = new E3225();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3224 e3224 = new E3224();


    public C517() {
    }


    public C517(Boolean Mandatory, String s3225, String s1131, String s3055, String s3224) {
        this.Mandatory = Mandatory;
        e3225.setContent(s3225);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3224.setContent(s3224);
    }


    public void validate() throws ValidityException {
        try {
            e3225.validate();
            e1131.validate();
            e3055.validate();
            e3224.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3225.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3224.toString();
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

