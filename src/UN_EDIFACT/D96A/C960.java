package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C960 {
    private final String Tag = "C960";
    private final String Description = "REASON FOR CHANGE";
    private final String LongDescription = "Code and/or description of the reason for a change.";
    private Boolean Mandatory;


    public E4295 e4295 = new E4295();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4294 e4294 = new E4294();


    public C960() {
    }


    public C960(Boolean Mandatory, String s4295, String s1131, String s3055, String s4294) {
        this.Mandatory = Mandatory;
        e4295.setContent(s4295);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4294.setContent(s4294);
    }


    public void validate() throws ValidityException {
        try {
            e4295.validate();
            e1131.validate();
            e3055.validate();
            e4294.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4295.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4294.toString();
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

