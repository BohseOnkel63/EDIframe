package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C099 {
    private final String Tag = "C099";
    private final String Description = "FILE DETAILS";
    private final String LongDescription = "To define details relevant to a file.";
    private Boolean Mandatory;


    public E1516 e1516 = new E1516();
    public E1056 e1056 = new E1056();
    public E1503 e1503 = new E1503();
    public E1502 e1502 = new E1502();


    public C099() {
        e1516.setMandatory(true);
    }


    public C099(Boolean Mandatory, String s1516, String s1056, String s1503, String s1502) {
        this.Mandatory = Mandatory;
        e1516.setContent(s1516);
        e1516.setMandatory(true);
        e1056.setContent(s1056);
        e1503.setContent(s1503);
        e1502.setContent(s1502);
    }


    public void validate() throws ValidityException {
        try {
            e1516.validate();
            e1056.validate();
            e1503.validate();
            e1502.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1516.toString() + ":" + e1056.toString() + ":" + e1503.toString() + ":" + e1502.toString();
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

