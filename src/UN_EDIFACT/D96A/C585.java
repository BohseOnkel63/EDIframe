package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C585 {
    private final String Tag = "C585";
    private final String Description = "PRIORITY DETAILS";
    private final String LongDescription = "To indicate a priority.";
    private Boolean Mandatory;


    public E4037 e4037 = new E4037();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4036 e4036 = new E4036();


    public C585() {
    }


    public C585(Boolean Mandatory, String s4037, String s1131, String s3055, String s4036) {
        this.Mandatory = Mandatory;
        e4037.setContent(s4037);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4036.setContent(s4036);
    }


    public void validate() throws ValidityException {
        try {
            e4037.validate();
            e1131.validate();
            e3055.validate();
            e4036.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4037.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4036.toString();
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

