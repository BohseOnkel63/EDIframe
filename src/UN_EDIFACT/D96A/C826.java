package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C826 {
    private final String Tag = "C826";
    private final String Description = "ACTION";
    private final String LongDescription = "To indicate an action which has been taken or is to be taken (e.g. in relation to a certain object).";
    private Boolean Mandatory;


    public E1229 e1229 = new E1229();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E1228 e1228 = new E1228();


    public C826() {
    }


    public C826(Boolean Mandatory, String s1229, String s1131, String s3055, String s1228) {
        this.Mandatory = Mandatory;
        e1229.setContent(s1229);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1228.setContent(s1228);
    }


    public void validate() throws ValidityException {
        try {
            e1229.validate();
            e1131.validate();
            e3055.validate();
            e1228.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1229.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e1228.toString();
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

