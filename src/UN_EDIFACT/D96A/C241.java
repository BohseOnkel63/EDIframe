package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C241 {
    private final String Tag = "C241";
    private final String Description = "DUTY/TAX/FEE TYPE";
    private final String LongDescription = "Code and/or name identifying duty, tax or fee.";
    private Boolean Mandatory;


    public E5153 e5153 = new E5153();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5152 e5152 = new E5152();


    public C241() {
    }


    public C241(Boolean Mandatory, String s5153, String s1131, String s3055, String s5152) {
        this.Mandatory = Mandatory;
        e5153.setContent(s5153);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5152.setContent(s5152);
    }


    public void validate() throws ValidityException {
        try {
            e5153.validate();
            e1131.validate();
            e3055.validate();
            e5152.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5153.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e5152.toString();
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

