package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C514 {
    private final String Tag = "C514";
    private final String Description = "SAMPLE LOCATION DETAILS";
    private final String LongDescription = "Identification of location within the specimen, from which the sample was taken.";
    private Boolean Mandatory;


    public E3237 e3237 = new E3237();
    public E3236 e3236 = new E3236();


    public C514() {
    }


    public C514(Boolean Mandatory, String s3237, String s3236) {
        this.Mandatory = Mandatory;
        e3237.setContent(s3237);
        e3236.setContent(s3236);
    }


    public void validate() throws ValidityException {
        try {
            e3237.validate();
            e3236.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3237.toString() + ":" + e3236.toString();
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

