package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C531 {
    private final String Tag = "C531";
    private final String Description = "PACKAGING DETAILS";
    private final String LongDescription = "Packaging level and details, terms and conditions.";
    private Boolean Mandatory;


    public E7075 e7075 = new E7075();
    public E7233 e7233 = new E7233();
    public E7073 e7073 = new E7073();


    public C531() {
    }


    public C531(Boolean Mandatory, String s7075, String s7233, String s7073) {
        this.Mandatory = Mandatory;
        e7075.setContent(s7075);
        e7233.setContent(s7233);
        e7073.setContent(s7073);
    }


    public void validate() throws ValidityException {
        try {
            e7075.validate();
            e7233.validate();
            e7073.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7075.toString() + ":" + e7233.toString() + ":" + e7073.toString();
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

