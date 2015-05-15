package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C953 {
    private final String Tag = "C953";
    private final String Description = "CONTRIBUTION TYPE";
    private final String LongDescription = "Identification of the type of a contribution to a scheme or group.";
    private Boolean Mandatory;


    public E5049 e5049 = new E5049();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5048 e5048 = new E5048();


    public C953() {
        e5049.setMandatory(true);
    }


    public C953(Boolean Mandatory, String s5049, String s1131, String s3055, String s5048) {
        this.Mandatory = Mandatory;
        e5049.setContent(s5049);
        e5049.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5048.setContent(s5048);
    }


    public void validate() throws ValidityException {
        try {
            e5049.validate();
            e1131.validate();
            e3055.validate();
            e5048.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5049.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e5048.toString();
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

