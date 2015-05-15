package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C329 {
    private final String Tag = "C329";
    private final String Description = "PATTERN DESCRIPTION";
    private final String LongDescription = "Shipment, delivery or production interval pattern and timing.";
    private Boolean Mandatory;


    public E2013 e2013 = new E2013();
    public E2015 e2015 = new E2015();
    public E2017 e2017 = new E2017();


    public C329() {
    }


    public C329(Boolean Mandatory, String s2013, String s2015, String s2017) {
        this.Mandatory = Mandatory;
        e2013.setContent(s2013);
        e2015.setContent(s2015);
        e2017.setContent(s2017);
    }


    public void validate() throws ValidityException {
        try {
            e2013.validate();
            e2015.validate();
            e2017.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e2013.toString() + ":" + e2015.toString() + ":" + e2017.toString();
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

