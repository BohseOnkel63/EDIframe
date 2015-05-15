package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C110 {
    private final String Tag = "C110";
    private final String Description = "PAYMENT TERMS";
    private final String LongDescription = "Terms of payment code from a specified source.";
    private Boolean Mandatory;


    public E4277 e4277 = new E4277();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4276 e4276_1 = new E4276();
    public E4276 e4276_2 = new E4276();


    public C110() {
        e4277.setMandatory(true);
    }


    public C110(Boolean Mandatory, String s4277, String s1131, String s3055, String s4276_1, String s4276_2) {
        this.Mandatory = Mandatory;
        e4277.setContent(s4277);
        e4277.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4276_1.setContent(s4276_1);
        e4276_2.setContent(s4276_2);
    }


    public void validate() throws ValidityException {
        try {
            e4277.validate();
            e1131.validate();
            e3055.validate();
            e4276_1.validate();
            e4276_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4277.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4276_1.toString() + ":" + e4276_2.toString();
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

