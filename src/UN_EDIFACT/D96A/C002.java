package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C002 {
    private final String Tag = "C002";
    private final String Description = "DOCUMENT/MESSAGE NAME";
    private final String LongDescription = "Identification of a type of document/message by code or name. Code preferred.";
    private Boolean Mandatory;


    public E1001 e1001 = new E1001();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E1000 e1000 = new E1000();


    public C002() {
    }


    public C002(Boolean Mandatory, String s1001, String s1131, String s3055, String s1000) {
        this.Mandatory = Mandatory;
        e1001.setContent(s1001);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1000.setContent(s1000);
    }


    public void validate() throws ValidityException {
        try {
            e1001.validate();
            e1131.validate();
            e3055.validate();
            e1000.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1001.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e1000.toString();
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

