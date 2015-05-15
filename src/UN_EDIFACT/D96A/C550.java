package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C550 {
    private final String Tag = "C550";
    private final String Description = "REQUIREMENT/CONDITION IDENTIFICATION";
    private final String LongDescription = "To identify the specific rule/condition requirement.";
    private Boolean Mandatory;


    public E7295 e7295 = new E7295();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7294 e7294 = new E7294();


    public C550() {
        e7295.setMandatory(true);
    }


    public C550(Boolean Mandatory, String s7295, String s1131, String s3055, String s7294) {
        this.Mandatory = Mandatory;
        e7295.setContent(s7295);
        e7295.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7294.setContent(s7294);
    }


    public void validate() throws ValidityException {
        try {
            e7295.validate();
            e1131.validate();
            e3055.validate();
            e7294.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7295.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7294.toString();
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

