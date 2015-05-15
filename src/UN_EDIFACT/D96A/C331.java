package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C331 {
    private final String Tag = "C331";
    private final String Description = "INSURANCE COVER DETAILS";
    private final String LongDescription = "To provide the insurance cover details.";
    private Boolean Mandatory;


    public E4495 e4495 = new E4495();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4494 e4494_1 = new E4494();
    public E4494 e4494_2 = new E4494();


    public C331() {
    }


    public C331(Boolean Mandatory, String s4495, String s1131, String s3055, String s4494_1, String s4494_2) {
        this.Mandatory = Mandatory;
        e4495.setContent(s4495);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4494_1.setContent(s4494_1);
        e4494_2.setContent(s4494_2);
    }


    public void validate() throws ValidityException {
        try {
            e4495.validate();
            e1131.validate();
            e3055.validate();
            e4494_1.validate();
            e4494_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4495.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4494_1.toString() + ":" + e4494_2.toString();
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

