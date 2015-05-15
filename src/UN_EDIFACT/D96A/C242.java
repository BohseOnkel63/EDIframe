package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C242 {
    private final String Tag = "C242";
    private final String Description = "PROCESS TYPE AND DESCRIPTION";
    private final String LongDescription = "Identification of process type and description.";
    private Boolean Mandatory;


    public E7187 e7187 = new E7187();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7186 e7186_1 = new E7186();
    public E7186 e7186_2 = new E7186();


    public C242() {
        e7187.setMandatory(true);
    }


    public C242(Boolean Mandatory, String s7187, String s1131, String s3055, String s7186_1, String s7186_2) {
        this.Mandatory = Mandatory;
        e7187.setContent(s7187);
        e7187.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7186_1.setContent(s7186_1);
        e7186_2.setContent(s7186_2);
    }


    public void validate() throws ValidityException {
        try {
            e7187.validate();
            e1131.validate();
            e3055.validate();
            e7186_1.validate();
            e7186_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7187.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7186_1.toString() + ":" + e7186_2.toString();
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

