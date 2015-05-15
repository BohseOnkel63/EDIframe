package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C554 {
    private final String Tag = "C554";
    private final String Description = "RATE/TARIFF CLASS DETAIL";
    private final String LongDescription = "Identification of the applicable rate/tariff class.";
    private Boolean Mandatory;


    public E5243 e5243 = new E5243();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C554() {
    }


    public C554(Boolean Mandatory, String s5243, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5243.setContent(s5243);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5243.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5243.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

