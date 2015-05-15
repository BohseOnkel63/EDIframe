package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C529 {
    private final String Tag = "C529";
    private final String Description = "PROCESSING INDICATOR";
    private final String LongDescription = "Type of process indication.";
    private Boolean Mandatory;


    public E7365 e7365 = new E7365();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7187 e7187 = new E7187();


    public C529() {
        e7365.setMandatory(true);
    }


    public C529(Boolean Mandatory, String s7365, String s1131, String s3055, String s7187) {
        this.Mandatory = Mandatory;
        e7365.setContent(s7365);
        e7365.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7187.setContent(s7187);
    }


    public void validate() throws ValidityException {
        try {
            e7365.validate();
            e1131.validate();
            e3055.validate();
            e7187.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7365.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7187.toString();
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

