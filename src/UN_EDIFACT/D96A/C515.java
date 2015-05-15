package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C515 {
    private final String Tag = "C515";
    private final String Description = "TEST REASON";
    private final String LongDescription = "To identify the reason for the test as specified.";
    private Boolean Mandatory;


    public E4425 e4425 = new E4425();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4424 e4424 = new E4424();


    public C515() {
    }


    public C515(Boolean Mandatory, String s4425, String s1131, String s3055, String s4424) {
        this.Mandatory = Mandatory;
        e4425.setContent(s4425);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4424.setContent(s4424);
    }


    public void validate() throws ValidityException {
        try {
            e4425.validate();
            e1131.validate();
            e3055.validate();
            e4424.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4425.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4424.toString();
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

