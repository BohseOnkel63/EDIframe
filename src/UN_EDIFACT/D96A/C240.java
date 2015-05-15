package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C240 {
    private final String Tag = "C240";
    private final String Description = "PRODUCT CHARACTERISTIC";
    private final String LongDescription = "Specific product characteristic data.";
    private Boolean Mandatory;


    public E7037 e7037 = new E7037();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7036 e7036_1 = new E7036();
    public E7036 e7036_2 = new E7036();


    public C240() {
        e7037.setMandatory(true);
    }


    public C240(Boolean Mandatory, String s7037, String s1131, String s3055, String s7036_1, String s7036_2) {
        this.Mandatory = Mandatory;
        e7037.setContent(s7037);
        e7037.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7036_1.setContent(s7036_1);
        e7036_2.setContent(s7036_2);
    }


    public void validate() throws ValidityException {
        try {
            e7037.validate();
            e1131.validate();
            e3055.validate();
            e7036_1.validate();
            e7036_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7037.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7036_1.toString() + ":" + e7036_2.toString();
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

