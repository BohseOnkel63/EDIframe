package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C100 {
    private final String Tag = "C100";
    private final String Description = "TERMS OF DELIVERY OR TRANSPORT";
    private final String LongDescription = "Terms of delivery or transport code from a specified source.";
    private Boolean Mandatory;


    public E4053 e4053 = new E4053();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4052 e4052_1 = new E4052();
    public E4052 e4052_2 = new E4052();


    public C100() {
    }


    public C100(Boolean Mandatory, String s4053, String s1131, String s3055, String s4052_1, String s4052_2) {
        this.Mandatory = Mandatory;
        e4053.setContent(s4053);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4052_1.setContent(s4052_1);
        e4052_2.setContent(s4052_2);
    }


    public void validate() throws ValidityException {
        try {
            e4053.validate();
            e1131.validate();
            e3055.validate();
            e4052_1.validate();
            e4052_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4053.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4052_1.toString() + ":" + e4052_2.toString();
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

