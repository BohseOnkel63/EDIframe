package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C231 {
    private final String Tag = "C231";
    private final String Description = "METHOD OF PAYMENT";
    private final String LongDescription = "Code identifying the method of payment.";
    private Boolean Mandatory;


    public E4215 e4215 = new E4215();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C231() {
        e4215.setMandatory(true);
    }


    public C231(Boolean Mandatory, String s4215, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e4215.setContent(s4215);
        e4215.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e4215.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4215.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

