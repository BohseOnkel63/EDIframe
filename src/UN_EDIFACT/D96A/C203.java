package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C203 {
    private final String Tag = "C203";
    private final String Description = "RATE/TARIFF CLASS";
    private final String LongDescription = "Identification of the applicable rate/tariff class.";
    private Boolean Mandatory;


    public E5243 e5243 = new E5243();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E5242 e5242 = new E5242();
    public E5275 e5275_1 = new E5275();
    public E1131 e1131_2 = new E1131();
    public E3055 e3055_2 = new E3055();
    public E5275 e5275_2 = new E5275();
    public E1131 e1131_3 = new E1131();
    public E3055 e3055_3 = new E3055();


    public C203() {
        e5243.setMandatory(true);
    }


    public C203(Boolean Mandatory, String s5243, String s1131_1, String s3055_1, String s5242, String s5275_1, String s1131_2, String s3055_2, String s5275_2, String s1131_3, String s3055_3) {
        this.Mandatory = Mandatory;
        e5243.setContent(s5243);
        e5243.setMandatory(true);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e5242.setContent(s5242);
        e5275_1.setContent(s5275_1);
        e1131_2.setContent(s1131_2);
        e3055_2.setContent(s3055_2);
        e5275_2.setContent(s5275_2);
        e1131_3.setContent(s1131_3);
        e3055_3.setContent(s3055_3);
    }


    public void validate() throws ValidityException {
        try {
            e5243.validate();
            e1131_1.validate();
            e3055_1.validate();
            e5242.validate();
            e5275_1.validate();
            e1131_2.validate();
            e3055_2.validate();
            e5275_2.validate();
            e1131_3.validate();
            e3055_3.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5243.toString() + ":" + e1131_1.toString() + ":" + e3055_1.toString() + ":" + e5242.toString() + ":" + e5275_1.toString() + ":" + e1131_2.toString() + ":" + e3055_2.toString() + ":" + e5275_2.toString() + ":" + e1131_3.toString() + ":" + e3055_3.toString();
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

