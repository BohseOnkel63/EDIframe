package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C816 {
    private final String Tag = "C816";
    private final String Description = "NAME COMPONENT DETAILS";
    private final String LongDescription = "To specify a name component.";
    private Boolean Mandatory;


    public E3405 e3405 = new E3405();
    public E3398 e3398 = new E3398();
    public E3401 e3401 = new E3401();
    public E3295 e3295 = new E3295();


    public C816() {
        e3405.setMandatory(true);
    }


    public C816(Boolean Mandatory, String s3405, String s3398, String s3401, String s3295) {
        this.Mandatory = Mandatory;
        e3405.setContent(s3405);
        e3405.setMandatory(true);
        e3398.setContent(s3398);
        e3401.setContent(s3401);
        e3295.setContent(s3295);
    }


    public void validate() throws ValidityException {
        try {
            e3405.validate();
            e3398.validate();
            e3401.validate();
            e3295.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3405.toString() + ":" + e3398.toString() + ":" + e3401.toString() + ":" + e3295.toString();
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

