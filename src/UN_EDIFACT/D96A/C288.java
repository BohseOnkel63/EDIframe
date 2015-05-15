package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C288 {
    private final String Tag = "C288";
    private final String Description = "PRODUCT GROUP";
    private final String LongDescription = "To give product group information.";
    private Boolean Mandatory;


    public E5389 e5389 = new E5389();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5388 e5388 = new E5388();


    public C288() {
    }


    public C288(Boolean Mandatory, String s5389, String s1131, String s3055, String s5388) {
        this.Mandatory = Mandatory;
        e5389.setContent(s5389);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5388.setContent(s5388);
    }


    public void validate() throws ValidityException {
        try {
            e5389.validate();
            e1131.validate();
            e3055.validate();
            e5388.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5389.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e5388.toString();
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

