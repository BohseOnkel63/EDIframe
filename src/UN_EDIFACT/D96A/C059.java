package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C059 {
    private final String Tag = "C059";
    private final String Description = "STREET";
    private final String LongDescription = "Street address and/or PO Box number in a structured address: one to three lines.";
    private Boolean Mandatory;


    public E3042 e3042_1 = new E3042();
    public E3042 e3042_2 = new E3042();
    public E3042 e3042_3 = new E3042();
    public E3042 e3042_4 = new E3042();


    public C059() {
        e3042_1.setMandatory(true);
    }


    public C059(Boolean Mandatory, String s3042_1, String s3042_2, String s3042_3, String s3042_4) {
        this.Mandatory = Mandatory;
        e3042_1.setContent(s3042_1);
        e3042_1.setMandatory(true);
        e3042_2.setContent(s3042_2);
        e3042_3.setContent(s3042_3);
        e3042_4.setContent(s3042_4);
    }


    public void validate() throws ValidityException {
        try {
            e3042_1.validate();
            e3042_2.validate();
            e3042_3.validate();
            e3042_4.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3042_1.toString() + ":" + e3042_2.toString() + ":" + e3042_3.toString() + ":" + e3042_4.toString();
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

