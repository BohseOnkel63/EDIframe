package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C212 {
    private final String Tag = "C212";
    private final String Description = "ITEM NUMBER IDENTIFICATION";
    private final String LongDescription = "Goods identification for a specified source.";
    private Boolean Mandatory;


    public E7140 e7140 = new E7140();
    public E7143 e7143 = new E7143();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C212() {
    }


    public C212(Boolean Mandatory, String s7140, String s7143, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e7140.setContent(s7140);
        e7143.setContent(s7143);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e7140.validate();
            e7143.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7140.toString() + ":" + e7143.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

