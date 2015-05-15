package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C286 {
    private final String Tag = "C286";
    private final String Description = "SEQUENCE INFORMATION";
    private final String LongDescription = "Identification of a sequence and source for sequencing.";
    private Boolean Mandatory;


    public E1050 e1050 = new E1050();
    public E1159 e1159 = new E1159();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C286() {
        e1050.setMandatory(true);
    }


    public C286(Boolean Mandatory, String s1050, String s1159, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e1050.setContent(s1050);
        e1050.setMandatory(true);
        e1159.setContent(s1159);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e1050.validate();
            e1159.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1050.toString() + ":" + e1159.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

