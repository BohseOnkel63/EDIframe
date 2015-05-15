package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C215 {
    private final String Tag = "C215";
    private final String Description = "SEAL ISSUER";
    private final String LongDescription = "Identification of the issuer of a seal on equipment either by code or by name.";
    private Boolean Mandatory;


    public E9303 e9303 = new E9303();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9302 e9302 = new E9302();


    public C215() {
    }


    public C215(Boolean Mandatory, String s9303, String s1131, String s3055, String s9302) {
        this.Mandatory = Mandatory;
        e9303.setContent(s9303);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9302.setContent(s9302);
    }


    public void validate() throws ValidityException {
        try {
            e9303.validate();
            e1131.validate();
            e3055.validate();
            e9302.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9303.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9302.toString();
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

