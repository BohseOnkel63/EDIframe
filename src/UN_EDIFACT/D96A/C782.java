package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C782 {
    private final String Tag = "C782";
    private final String Description = "DATA SET IDENTIFICATION";
    private final String LongDescription = "The identification of a data set.";
    private Boolean Mandatory;


    public E1520 e1520 = new E1520();
    public E7405 e7405 = new E7405();


    public C782() {
        e1520.setMandatory(true);
    }


    public C782(Boolean Mandatory, String s1520, String s7405) {
        this.Mandatory = Mandatory;
        e1520.setContent(s1520);
        e1520.setMandatory(true);
        e7405.setContent(s7405);
    }


    public void validate() throws ValidityException {
        try {
            e1520.validate();
            e7405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1520.toString() + ":" + e7405.toString();
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

