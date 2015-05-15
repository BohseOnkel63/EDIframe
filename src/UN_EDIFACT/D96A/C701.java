package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C701 {
    private final String Tag = "C701";
    private final String Description = "ERROR POINT DETAILS";
    private final String LongDescription = "Indication of the point of error in a message.";
    private Boolean Mandatory;


    public E1049 e1049 = new E1049();
    public E1052 e1052 = new E1052();
    public E1054 e1054 = new E1054();


    public C701() {
        e1049.setMandatory(true);
    }


    public C701(Boolean Mandatory, String s1049, String s1052, String s1054) {
        this.Mandatory = Mandatory;
        e1049.setContent(s1049);
        e1049.setMandatory(true);
        e1052.setContent(s1052);
        e1054.setContent(s1054);
    }


    public void validate() throws ValidityException {
        try {
            e1049.validate();
            e1052.validate();
            e1054.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1049.toString() + ":" + e1052.toString() + ":" + e1054.toString();
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

