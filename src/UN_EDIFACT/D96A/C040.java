package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C040 {
    private final String Tag = "C040";
    private final String Description = "CARRIER";
    private final String LongDescription = "Identification of a carrier by code and/or by name. Code preferred.";
    private Boolean Mandatory;


    public E3127 e3127 = new E3127();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3128 e3128 = new E3128();


    public C040() {
    }


    public C040(Boolean Mandatory, String s3127, String s1131, String s3055, String s3128) {
        this.Mandatory = Mandatory;
        e3127.setContent(s3127);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3128.setContent(s3128);
    }


    public void validate() throws ValidityException {
        try {
            e3127.validate();
            e1131.validate();
            e3055.validate();
            e3128.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3127.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3128.toString();
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

