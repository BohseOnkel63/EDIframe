package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C527 {
    private final String Tag = "C527";
    private final String Description = "STATISTICAL DETAILS";
    private final String LongDescription = "Specifications related to statistical measurements.";
    private Boolean Mandatory;


    public E6314 e6314 = new E6314();
    public E6411 e6411 = new E6411();
    public E6313 e6313 = new E6313();
    public E6321 e6321 = new E6321();


    public C527() {
    }


    public C527(Boolean Mandatory, String s6314, String s6411, String s6313, String s6321) {
        this.Mandatory = Mandatory;
        e6314.setContent(s6314);
        e6411.setContent(s6411);
        e6313.setContent(s6313);
        e6321.setContent(s6321);
    }


    public void validate() throws ValidityException {
        try {
            e6314.validate();
            e6411.validate();
            e6313.validate();
            e6321.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6314.toString() + ":" + e6411.toString() + ":" + e6313.toString() + ":" + e6321.toString();
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

