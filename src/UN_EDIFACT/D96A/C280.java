package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C280 {
    private final String Tag = "C280";
    private final String Description = "RANGE";
    private final String LongDescription = "Range minimum and maximum limits.";
    private Boolean Mandatory;


    public E6411 e6411 = new E6411();
    public E6162 e6162 = new E6162();
    public E6152 e6152 = new E6152();


    public C280() {
        e6411.setMandatory(true);
    }


    public C280(Boolean Mandatory, String s6411, String s6162, String s6152) {
        this.Mandatory = Mandatory;
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6162.setContent(s6162);
        e6152.setContent(s6152);
    }


    public void validate() throws ValidityException {
        try {
            e6411.validate();
            e6162.validate();
            e6152.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6411.toString() + ":" + e6162.toString() + ":" + e6152.toString();
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

