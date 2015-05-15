package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C330 {
    private final String Tag = "C330";
    private final String Description = "INSURANCE COVER TYPE";
    private final String LongDescription = "To provide the insurance cover type.";
    private Boolean Mandatory;


    public E4497 e4497 = new E4497();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C330() {
        e4497.setMandatory(true);
    }


    public C330(Boolean Mandatory, String s4497, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e4497.setContent(s4497);
        e4497.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e4497.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4497.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

