package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C042 {
    private final String Tag = "C042";
    private final String Description = "NATIONALITY DETAILS";
    private final String LongDescription = "To specify a nationality.";
    private Boolean Mandatory;


    public E3293 e3293 = new E3293();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3292 e3292 = new E3292();


    public C042() {
    }


    public C042(Boolean Mandatory, String s3293, String s1131, String s3055, String s3292) {
        this.Mandatory = Mandatory;
        e3293.setContent(s3293);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3292.setContent(s3292);
    }


    public void validate() throws ValidityException {
        try {
            e3293.validate();
            e1131.validate();
            e3055.validate();
            e3292.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3293.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3292.toString();
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

