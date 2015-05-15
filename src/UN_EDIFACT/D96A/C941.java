package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C941 {
    private final String Tag = "C941";
    private final String Description = "RELATIONSHIP";
    private final String LongDescription = "Identification and/or description of a relationship.";
    private Boolean Mandatory;


    public E9143 e9143 = new E9143();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9142 e9142 = new E9142();


    public C941() {
    }


    public C941(Boolean Mandatory, String s9143, String s1131, String s3055, String s9142) {
        this.Mandatory = Mandatory;
        e9143.setContent(s9143);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9142.setContent(s9142);
    }


    public void validate() throws ValidityException {
        try {
            e9143.validate();
            e1131.validate();
            e3055.validate();
            e9142.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9143.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9142.toString();
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

