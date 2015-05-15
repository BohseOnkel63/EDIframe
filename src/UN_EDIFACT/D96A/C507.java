package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C507 {
    private final String Tag = "C507";
    private final String Description = "DATE/TIME/PERIOD";
    private final String LongDescription = "Date and/or time, or period relevant to the specified date/time/period type.";
    private Boolean Mandatory;


    public E2005 e2005 = new E2005();
    public E2380 e2380 = new E2380();
    public E2379 e2379 = new E2379();


    public C507() {
        e2005.setMandatory(true);
    }


    public C507(Boolean Mandatory, String s2005, String s2380, String s2379) {
        this.Mandatory = Mandatory;
        e2005.setContent(s2005);
        e2005.setMandatory(true);
        e2380.setContent(s2380);
        e2379.setContent(s2379);
    }


    public void validate() throws ValidityException {
        try {
            e2005.validate();
            e2380.validate();
            e2379.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e2005.toString() + ":" + e2380.toString() + ":" + e2379.toString();
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

