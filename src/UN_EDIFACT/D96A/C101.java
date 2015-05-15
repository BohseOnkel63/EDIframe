package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C101 {
    private final String Tag = "C101";
    private final String Description = "RELIGION DETAILS";
    private final String LongDescription = "To specify the religion of a person.";
    private Boolean Mandatory;


    public E3483 e3483 = new E3483();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3482 e3482 = new E3482();


    public C101() {
    }


    public C101(Boolean Mandatory, String s3483, String s1131, String s3055, String s3482) {
        this.Mandatory = Mandatory;
        e3483.setContent(s3483);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3482.setContent(s3482);
    }


    public void validate() throws ValidityException {
        try {
            e3483.validate();
            e1131.validate();
            e3055.validate();
            e3482.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3483.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3482.toString();
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

