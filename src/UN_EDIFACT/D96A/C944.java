package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C944 {
    private final String Tag = "C944";
    private final String Description = "MEMBERSHIP STATUS";
    private final String LongDescription = "Code and/or description of membership status.";
    private Boolean Mandatory;


    public E7453 e7453 = new E7453();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7452 e7452 = new E7452();


    public C944() {
    }


    public C944(Boolean Mandatory, String s7453, String s1131, String s3055, String s7452) {
        this.Mandatory = Mandatory;
        e7453.setContent(s7453);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7452.setContent(s7452);
    }


    public void validate() throws ValidityException {
        try {
            e7453.validate();
            e1131.validate();
            e3055.validate();
            e7452.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7453.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7452.toString();
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

