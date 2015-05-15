package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C088 {
    private final String Tag = "C088";
    private final String Description = "INSTITUTION IDENTIFICATION";
    private final String LongDescription = "Identification of a financial institution by code branch number, or name and name of place. Code or branch number preferred.";
    private Boolean Mandatory;


    public E3433 e3433 = new E3433();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E3434 e3434 = new E3434();
    public E1131 e1131_2 = new E1131();
    public E3055 e3055_2 = new E3055();
    public E3432 e3432 = new E3432();
    public E3436 e3436 = new E3436();


    public C088() {
    }


    public C088(Boolean Mandatory, String s3433, String s1131_1, String s3055_1, String s3434, String s1131_2, String s3055_2, String s3432, String s3436) {
        this.Mandatory = Mandatory;
        e3433.setContent(s3433);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e3434.setContent(s3434);
        e1131_2.setContent(s1131_2);
        e3055_2.setContent(s3055_2);
        e3432.setContent(s3432);
        e3436.setContent(s3436);
    }


    public void validate() throws ValidityException {
        try {
            e3433.validate();
            e1131_1.validate();
            e3055_1.validate();
            e3434.validate();
            e1131_2.validate();
            e3055_2.validate();
            e3432.validate();
            e3436.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3433.toString() + ":" + e1131_1.toString() + ":" + e3055_1.toString() + ":" + e3434.toString() + ":" + e1131_2.toString() + ":" + e3055_2.toString() + ":" + e3432.toString() + ":" + e3436.toString();
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

