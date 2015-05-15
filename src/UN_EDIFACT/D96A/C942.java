package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C942 {
    private final String Tag = "C942";
    private final String Description = "MEMBERSHIP CATEGORY";
    private final String LongDescription = "Identification and/or description of a membership category for a member of a scheme or group.";
    private Boolean Mandatory;


    public E7451 e7451 = new E7451();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7450 e7450 = new E7450();


    public C942() {
        e7451.setMandatory(true);
    }


    public C942(Boolean Mandatory, String s7451, String s1131, String s3055, String s7450) {
        this.Mandatory = Mandatory;
        e7451.setContent(s7451);
        e7451.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7450.setContent(s7450);
    }


    public void validate() throws ValidityException {
        try {
            e7451.validate();
            e1131.validate();
            e3055.validate();
            e7450.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7451.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7450.toString();
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

