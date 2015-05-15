package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C522 {
    private final String Tag = "C522";
    private final String Description = "INSTRUCTION";
    private final String LongDescription = "To specify an instruction.";
    private Boolean Mandatory;


    public E4403 e4403 = new E4403();
    public E4401 e4401 = new E4401();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4400 e4400 = new E4400();


    public C522() {
        e4403.setMandatory(true);
    }


    public C522(Boolean Mandatory, String s4403, String s4401, String s1131, String s3055, String s4400) {
        this.Mandatory = Mandatory;
        e4403.setContent(s4403);
        e4403.setMandatory(true);
        e4401.setContent(s4401);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4400.setContent(s4400);
    }


    public void validate() throws ValidityException {
        try {
            e4403.validate();
            e4401.validate();
            e1131.validate();
            e3055.validate();
            e4400.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4403.toString() + ":" + e4401.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4400.toString();
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

