package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C082 {
    private final String Tag = "C082";
    private final String Description = "PARTY IDENTIFICATION DETAILS";
    private final String LongDescription = "Identification of a transaction party by code.";
    private Boolean Mandatory;


    public E3039 e3039 = new E3039();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C082() {
        e3039.setMandatory(true);
    }


    public C082(Boolean Mandatory, String s3039, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e3039.setContent(s3039);
        e3039.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e3039.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3039.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

