package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C233 {
    private final String Tag = "C233";
    private final String Description = "SERVICE";
    private final String LongDescription = "To identify a service (which may constitute an additional component to a basic contract).";
    private Boolean Mandatory;


    public E7273 e7273_1 = new E7273();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E7273 e7273_2 = new E7273();
    public E1131 e1131_2 = new E1131();
    public E3055 e3055_2 = new E3055();


    public C233() {
        e7273_1.setMandatory(true);
    }


    public C233(Boolean Mandatory, String s7273_1, String s1131_1, String s3055_1, String s7273_2, String s1131_2, String s3055_2) {
        this.Mandatory = Mandatory;
        e7273_1.setContent(s7273_1);
        e7273_1.setMandatory(true);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e7273_2.setContent(s7273_2);
        e1131_2.setContent(s1131_2);
        e3055_2.setContent(s3055_2);
    }


    public void validate() throws ValidityException {
        try {
            e7273_1.validate();
            e1131_1.validate();
            e3055_1.validate();
            e7273_2.validate();
            e1131_2.validate();
            e3055_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7273_1.toString() + ":" + e1131_1.toString() + ":" + e3055_1.toString() + ":" + e7273_2.toString() + ":" + e1131_2.toString() + ":" + e3055_2.toString();
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

