package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C333 {
    private final String Tag = "C333";
    private final String Description = "INFORMATION REQUEST";
    private final String LongDescription = "To specify the information requested in a responding message.";
    private Boolean Mandatory;


    public E4511 e4511 = new E4511();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4510 e4510 = new E4510();


    public C333() {
    }


    public C333(Boolean Mandatory, String s4511, String s1131, String s3055, String s4510) {
        this.Mandatory = Mandatory;
        e4511.setContent(s4511);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4510.setContent(s4510);
    }


    public void validate() throws ValidityException {
        try {
            e4511.validate();
            e1131.validate();
            e3055.validate();
            e4510.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4511.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4510.toString();
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

