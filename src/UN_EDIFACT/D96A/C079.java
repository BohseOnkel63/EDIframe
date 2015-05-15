package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C079 {
    private final String Tag = "C079";
    private final String Description = "COMPUTER ENVIRONMENT IDENTIFICATION";
    private final String LongDescription = "To identify parts of a computer environment.";
    private Boolean Mandatory;


    public E1511 e1511 = new E1511();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E1510 e1510 = new E1510();
    public E1056 e1056 = new E1056();
    public E1058 e1058 = new E1058();
    public E7402 e7402 = new E7402();


    public C079() {
    }


    public C079(Boolean Mandatory, String s1511, String s1131, String s3055, String s1510, String s1056, String s1058, String s7402) {
        this.Mandatory = Mandatory;
        e1511.setContent(s1511);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1510.setContent(s1510);
        e1056.setContent(s1056);
        e1058.setContent(s1058);
        e7402.setContent(s7402);
    }


    public void validate() throws ValidityException {
        try {
            e1511.validate();
            e1131.validate();
            e3055.validate();
            e1510.validate();
            e1056.validate();
            e1058.validate();
            e7402.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1511.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e1510.toString() + ":" + e1056.toString() + ":" + e1058.toString() + ":" + e7402.toString();
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

