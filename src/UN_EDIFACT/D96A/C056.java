package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C056 {
    private final String Tag = "C056";
    private final String Description = "DEPARTMENT OR EMPLOYEE DETAILS";
    private final String LongDescription = "Code and/or name of a department or employee. Code preferred.";
    private Boolean Mandatory;


    public E3413 e3413 = new E3413();
    public E3412 e3412 = new E3412();


    public C056() {
    }


    public C056(Boolean Mandatory, String s3413, String s3412) {
        this.Mandatory = Mandatory;
        e3413.setContent(s3413);
        e3412.setContent(s3412);
    }


    public void validate() throws ValidityException {
        try {
            e3413.validate();
            e3412.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3413.toString() + ":" + e3412.toString();
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

