package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C523 {
    private final String Tag = "C523";
    private final String Description = "NUMBER OF UNIT DETAILS";
    private final String LongDescription = "Identification of number of units and its purpose.";
    private Boolean Mandatory;


    public E6350 e6350 = new E6350();
    public E6353 e6353 = new E6353();


    public C523() {
    }


    public C523(Boolean Mandatory, String s6350, String s6353) {
        this.Mandatory = Mandatory;
        e6350.setContent(s6350);
        e6353.setContent(s6353);
    }


    public void validate() throws ValidityException {
        try {
            e6350.validate();
            e6353.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6350.toString() + ":" + e6353.toString();
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

