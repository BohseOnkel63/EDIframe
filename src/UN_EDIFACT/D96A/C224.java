package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C224 {
    private final String Tag = "C224";
    private final String Description = "EQUIPMENT SIZE AND TYPE";
    private final String LongDescription = "Code and/or name identifying size and type of equipment used in transport. Code preferred.";
    private Boolean Mandatory;


    public E8155 e8155 = new E8155();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E8154 e8154 = new E8154();


    public C224() {
    }


    public C224(Boolean Mandatory, String s8155, String s1131, String s3055, String s8154) {
        this.Mandatory = Mandatory;
        e8155.setContent(s8155);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8154.setContent(s8154);
    }


    public void validate() throws ValidityException {
        try {
            e8155.validate();
            e1131.validate();
            e3055.validate();
            e8154.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8155.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e8154.toString();
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

