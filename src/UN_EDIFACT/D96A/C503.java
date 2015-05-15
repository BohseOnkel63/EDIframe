package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C503 {
    private final String Tag = "C503";
    private final String Description = "DOCUMENT/MESSAGE DETAILS";
    private final String LongDescription = "Identification of document/message by number, status, source and/or language.";
    private Boolean Mandatory;


    public E1004 e1004 = new E1004();
    public E1373 e1373 = new E1373();
    public E1366 e1366 = new E1366();
    public E3453 e3453 = new E3453();


    public C503() {
    }


    public C503(Boolean Mandatory, String s1004, String s1373, String s1366, String s3453) {
        this.Mandatory = Mandatory;
        e1004.setContent(s1004);
        e1373.setContent(s1373);
        e1366.setContent(s1366);
        e3453.setContent(s3453);
    }


    public void validate() throws ValidityException {
        try {
            e1004.validate();
            e1373.validate();
            e1366.validate();
            e3453.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1004.toString() + ":" + e1373.toString() + ":" + e1366.toString() + ":" + e3453.toString();
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

