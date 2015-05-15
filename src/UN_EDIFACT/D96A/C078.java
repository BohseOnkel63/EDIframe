package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C078 {
    private final String Tag = "C078";
    private final String Description = "ACCOUNT IDENTIFICATION";
    private final String LongDescription = "Identification of an account holder by account number and/or account holder name in one or two lines. Number preferred.";
    private Boolean Mandatory;


    public E3194 e3194 = new E3194();
    public E3192 e3192_1 = new E3192();
    public E3192 e3192_2 = new E3192();
    public E6345 e6345 = new E6345();


    public C078() {
    }


    public C078(Boolean Mandatory, String s3194, String s3192_1, String s3192_2, String s6345) {
        this.Mandatory = Mandatory;
        e3194.setContent(s3194);
        e3192_1.setContent(s3192_1);
        e3192_2.setContent(s3192_2);
        e6345.setContent(s6345);
    }


    public void validate() throws ValidityException {
        try {
            e3194.validate();
            e3192_1.validate();
            e3192_2.validate();
            e6345.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3194.toString() + ":" + e3192_1.toString() + ":" + e3192_2.toString() + ":" + e6345.toString();
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

