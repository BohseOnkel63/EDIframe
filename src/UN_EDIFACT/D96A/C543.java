package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C543 {
    private final String Tag = "C543";
    private final String Description = "AGREEMENT TYPE IDENTIFICATION";
    private final String LongDescription = "Identification of specific agreement type by code or name.";
    private Boolean Mandatory;


    public E7431 e7431 = new E7431();
    public E7433 e7433 = new E7433();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7434 e7434 = new E7434();


    public C543() {
        e7431.setMandatory(true);
    }


    public C543(Boolean Mandatory, String s7431, String s7433, String s1131, String s3055, String s7434) {
        this.Mandatory = Mandatory;
        e7431.setContent(s7431);
        e7431.setMandatory(true);
        e7433.setContent(s7433);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7434.setContent(s7434);
    }


    public void validate() throws ValidityException {
        try {
            e7431.validate();
            e7433.validate();
            e1131.validate();
            e3055.validate();
            e7434.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7431.toString() + ":" + e7433.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7434.toString();
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

