package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C512 {
    private final String Tag = "C512";
    private final String Description = "SIZE DETAILS";
    private final String LongDescription = "Information about the number of observations.";
    private Boolean Mandatory;


    public E6173 e6173 = new E6173();
    public E6174 e6174 = new E6174();


    public C512() {
    }


    public C512(Boolean Mandatory, String s6173, String s6174) {
        this.Mandatory = Mandatory;
        e6173.setContent(s6173);
        e6174.setContent(s6174);
    }


    public void validate() throws ValidityException {
        try {
            e6173.validate();
            e6174.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6173.toString() + ":" + e6174.toString();
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

