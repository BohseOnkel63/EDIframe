package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C402 {
    private final String Tag = "C402";
    private final String Description = "PACKAGE TYPE IDENTIFICATION";
    private final String LongDescription = "Identification of the form in which goods are described.";
    private Boolean Mandatory;


    public E7077 e7077 = new E7077();
    public E7064 e7064_1 = new E7064();
    public E7143 e7143_1 = new E7143();
    public E7064 e7064_2 = new E7064();
    public E7143 e7143_2 = new E7143();


    public C402() {
        e7077.setMandatory(true);
        e7064_1.setMandatory(true);
    }


    public C402(Boolean Mandatory, String s7077, String s7064_1, String s7143_1, String s7064_2, String s7143_2) {
        this.Mandatory = Mandatory;
        e7077.setContent(s7077);
        e7077.setMandatory(true);
        e7064_1.setContent(s7064_1);
        e7064_1.setMandatory(true);
        e7143_1.setContent(s7143_1);
        e7064_2.setContent(s7064_2);
        e7143_2.setContent(s7143_2);
    }


    public void validate() throws ValidityException {
        try {
            e7077.validate();
            e7064_1.validate();
            e7143_1.validate();
            e7064_2.validate();
            e7143_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7077.toString() + ":" + e7064_1.toString() + ":" + e7143_1.toString() + ":" + e7064_2.toString() + ":" + e7143_2.toString();
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

