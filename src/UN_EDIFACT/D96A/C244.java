package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C244 {
    private final String Tag = "C244";
    private final String Description = "TEST METHOD";
    private final String LongDescription = "Specification of the test method employed.";
    private Boolean Mandatory;


    public E4415 e4415 = new E4415();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4416 e4416 = new E4416();


    public C244() {
    }


    public C244(Boolean Mandatory, String s4415, String s1131, String s3055, String s4416) {
        this.Mandatory = Mandatory;
        e4415.setContent(s4415);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4416.setContent(s4416);
    }


    public void validate() throws ValidityException {
        try {
            e4415.validate();
            e1131.validate();
            e3055.validate();
            e4416.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4415.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4416.toString();
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

