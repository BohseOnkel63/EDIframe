package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C502 {
    private final String Tag = "C502";
    private final String Description = "MEASUREMENT DETAILS";
    private final String LongDescription = "Identification of measurement type.";
    private Boolean Mandatory;


    public E6313 e6313 = new E6313();
    public E6321 e6321 = new E6321();
    public E6155 e6155 = new E6155();
    public E6154 e6154 = new E6154();


    public C502() {
    }


    public C502(Boolean Mandatory, String s6313, String s6321, String s6155, String s6154) {
        this.Mandatory = Mandatory;
        e6313.setContent(s6313);
        e6321.setContent(s6321);
        e6155.setContent(s6155);
        e6154.setContent(s6154);
    }


    public void validate() throws ValidityException {
        try {
            e6313.validate();
            e6321.validate();
            e6155.validate();
            e6154.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6313.toString() + ":" + e6321.toString() + ":" + e6155.toString() + ":" + e6154.toString();
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

