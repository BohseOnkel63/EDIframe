package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C508 {
    private final String Tag = "C508";
    private final String Description = "LANGUAGE DETAILS";
    private final String LongDescription = "To identify a language.";
    private Boolean Mandatory;


    public E3453 e3453 = new E3453();
    public E3452 e3452 = new E3452();


    public C508() {
    }


    public C508(Boolean Mandatory, String s3453, String s3452) {
        this.Mandatory = Mandatory;
        e3453.setContent(s3453);
        e3452.setContent(s3452);
    }


    public void validate() throws ValidityException {
        try {
            e3453.validate();
            e3452.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3453.toString() + ":" + e3452.toString();
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

