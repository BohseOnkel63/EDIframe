package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C553 {
    private final String Tag = "C553";
    private final String Description = "RELATED LOCATION TWO IDENTIFICATION";
    private final String LongDescription = "Identification of second related location by code or name.";
    private Boolean Mandatory;


    public E3233 e3233 = new E3233();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3232 e3232 = new E3232();


    public C553() {
    }


    public C553(Boolean Mandatory, String s3233, String s1131, String s3055, String s3232) {
        this.Mandatory = Mandatory;
        e3233.setContent(s3233);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3232.setContent(s3232);
    }


    public void validate() throws ValidityException {
        try {
            e3233.validate();
            e1131.validate();
            e3055.validate();
            e3232.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3233.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3232.toString();
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

