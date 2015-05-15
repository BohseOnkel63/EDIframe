package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C555 {
    private final String Tag = "C555";
    private final String Description = "STATUS EVENT";
    private final String LongDescription = "To specify a status event.";
    private Boolean Mandatory;


    public E9011 e9011 = new E9011();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9010 e9010 = new E9010();


    public C555() {
        e9011.setMandatory(true);
    }


    public C555(Boolean Mandatory, String s9011, String s1131, String s3055, String s9010) {
        this.Mandatory = Mandatory;
        e9011.setContent(s9011);
        e9011.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9010.setContent(s9010);
    }


    public void validate() throws ValidityException {
        try {
            e9011.validate();
            e1131.validate();
            e3055.validate();
            e9010.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9011.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9010.toString();
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

