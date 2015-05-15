package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C332 {
    private final String Tag = "C332";
    private final String Description = "SALES CHANNEL IDENTIFICATION";
    private final String LongDescription = "Identification of sales channel for marketing data, sales, forecast, planning...";
    private Boolean Mandatory;


    public E3496 e3496 = new E3496();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C332() {
        e3496.setMandatory(true);
    }


    public C332(Boolean Mandatory, String s3496, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e3496.setContent(s3496);
        e3496.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e3496.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3496.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

