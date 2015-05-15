package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C076 {
    private final String Tag = "C076";
    private final String Description = "COMMUNICATION CONTACT";
    private final String LongDescription = "Communication number of a department or employee in a specified channel.";
    private Boolean Mandatory;


    public E3148 e3148 = new E3148();
    public E3155 e3155 = new E3155();


    public C076() {
        e3148.setMandatory(true);
        e3155.setMandatory(true);
    }


    public C076(Boolean Mandatory, String s3148, String s3155) {
        this.Mandatory = Mandatory;
        e3148.setContent(s3148);
        e3148.setMandatory(true);
        e3155.setContent(s3155);
        e3155.setMandatory(true);
    }


    public void validate() throws ValidityException {
        try {
            e3148.validate();
            e3155.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3148.toString() + ":" + e3155.toString();
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

