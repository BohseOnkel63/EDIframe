package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C533 {
    private final String Tag = "C533";
    private final String Description = "DUTY/TAX/FEE ACCOUNT DETAIL";
    private final String LongDescription = "Indication of account reference for duties, taxes and/or fees.";
    private Boolean Mandatory;


    public E5289 e5289 = new E5289();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C533() {
        e5289.setMandatory(true);
    }


    public C533(Boolean Mandatory, String s5289, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5289.setContent(s5289);
        e5289.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5289.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5289.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

