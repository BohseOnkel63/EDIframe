package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C709 {
    private final String Tag = "C709";
    private final String Description = "MESSAGE IDENTIFIER";
    private final String LongDescription = "Identification of the message.";
    private Boolean Mandatory;


    public E1475 e1475 = new E1475();
    public E1056 e1056 = new E1056();
    public E1058 e1058 = new E1058();
    public E1476 e1476 = new E1476();
    public E1523 e1523 = new E1523();
    public E1060 e1060 = new E1060();


    public C709() {
        e1475.setMandatory(true);
        e1056.setMandatory(true);
        e1058.setMandatory(true);
        e1476.setMandatory(true);
    }


    public C709(Boolean Mandatory, String s1475, String s1056, String s1058, String s1476, String s1523, String s1060) {
        this.Mandatory = Mandatory;
        e1475.setContent(s1475);
        e1475.setMandatory(true);
        e1056.setContent(s1056);
        e1056.setMandatory(true);
        e1058.setContent(s1058);
        e1058.setMandatory(true);
        e1476.setContent(s1476);
        e1476.setMandatory(true);
        e1523.setContent(s1523);
        e1060.setContent(s1060);
    }


    public void validate() throws ValidityException {
        try {
            e1475.validate();
            e1056.validate();
            e1058.validate();
            e1476.validate();
            e1523.validate();
            e1060.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1475.toString() + ":" + e1056.toString() + ":" + e1058.toString() + ":" + e1476.toString() + ":" + e1523.toString() + ":" + e1060.toString();
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

