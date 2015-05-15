package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C534 {
    private final String Tag = "C534";
    private final String Description = "PAYMENT INSTRUCTION DETAILS";
    private final String LongDescription = "Indication of method of payment employed or to be employed.";
    private Boolean Mandatory;


    public E4439 e4439 = new E4439();
    public E4431 e4431 = new E4431();
    public E4461 e4461 = new E4461();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4435 e4435 = new E4435();


    public C534() {
    }


    public C534(Boolean Mandatory, String s4439, String s4431, String s4461, String s1131, String s3055, String s4435) {
        this.Mandatory = Mandatory;
        e4439.setContent(s4439);
        e4431.setContent(s4431);
        e4461.setContent(s4461);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4435.setContent(s4435);
    }


    public void validate() throws ValidityException {
        try {
            e4439.validate();
            e4431.validate();
            e4461.validate();
            e1131.validate();
            e3055.validate();
            e4435.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4439.toString() + ":" + e4431.toString() + ":" + e4461.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4435.toString();
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

