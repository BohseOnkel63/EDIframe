package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C551 {
    private final String Tag = "C551";
    private final String Description = "BANK OPERATION";
    private final String LongDescription = "Identification of a bank operation by code.";
    private Boolean Mandatory;


    public E4383 e4383 = new E4383();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C551() {
        e4383.setMandatory(true);
    }


    public C551(Boolean Mandatory, String s4383, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e4383.setContent(s4383);
        e4383.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e4383.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4383.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

