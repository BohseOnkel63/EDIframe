package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C213 {
    private final String Tag = "C213";
    private final String Description = "NUMBER AND TYPE OF PACKAGES";
    private final String LongDescription = "Number and type of individual parts of a shipment.";
    private Boolean Mandatory;


    public E7224 e7224 = new E7224();
    public E7065 e7065 = new E7065();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7064 e7064 = new E7064();


    public C213() {
    }


    public C213(Boolean Mandatory, String s7224, String s7065, String s1131, String s3055, String s7064) {
        this.Mandatory = Mandatory;
        e7224.setContent(s7224);
        e7065.setContent(s7065);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7064.setContent(s7064);
    }


    public void validate() throws ValidityException {
        try {
            e7224.validate();
            e7065.validate();
            e1131.validate();
            e3055.validate();
            e7064.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7224.toString() + ":" + e7065.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7064.toString();
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

