package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C234 {
    private final String Tag = "C234";
    private final String Description = "UNDG INFORMATION";
    private final String LongDescription = "Information on United Nations Dangerous Goods classification.";
    private Boolean Mandatory;


    public E7124 e7124 = new E7124();
    public E7088 e7088 = new E7088();


    public C234() {
    }


    public C234(Boolean Mandatory, String s7124, String s7088) {
        this.Mandatory = Mandatory;
        e7124.setContent(s7124);
        e7088.setContent(s7088);
    }


    public void validate() throws ValidityException {
        try {
            e7124.validate();
            e7088.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7124.toString() + ":" + e7088.toString();
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

