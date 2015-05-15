package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C519 {
    private final String Tag = "C519";
    private final String Description = "RELATED LOCATION ONE IDENTIFICATION";
    private final String LongDescription = "Identification the first related location by code or name.";
    private Boolean Mandatory;


    public E3223 e3223 = new E3223();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3222 e3222 = new E3222();


    public C519() {
    }


    public C519(Boolean Mandatory, String s3223, String s1131, String s3055, String s3222) {
        this.Mandatory = Mandatory;
        e3223.setContent(s3223);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3222.setContent(s3222);
    }


    public void validate() throws ValidityException {
        try {
            e3223.validate();
            e1131.validate();
            e3055.validate();
            e3222.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3223.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3222.toString();
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

