package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C128 {
    private final String Tag = "C128";
    private final String Description = "RATE DETAILS";
    private final String LongDescription = "Rate per unit and rate basis.";
    private Boolean Mandatory;


    public E5419 e5419 = new E5419();
    public E5420 e5420 = new E5420();
    public E5284 e5284 = new E5284();
    public E6411 e6411 = new E6411();


    public C128() {
        e5419.setMandatory(true);
        e5420.setMandatory(true);
    }


    public C128(Boolean Mandatory, String s5419, String s5420, String s5284, String s6411) {
        this.Mandatory = Mandatory;
        e5419.setContent(s5419);
        e5419.setMandatory(true);
        e5420.setContent(s5420);
        e5420.setMandatory(true);
        e5284.setContent(s5284);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e5419.validate();
            e5420.validate();
            e5284.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5419.toString() + ":" + e5420.toString() + ":" + e5284.toString() + ":" + e6411.toString();
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

