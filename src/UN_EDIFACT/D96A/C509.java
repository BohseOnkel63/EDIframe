package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C509 {
    private final String Tag = "C509";
    private final String Description = "PRICE INFORMATION";
    private final String LongDescription = "Identification of price type, price and related details.";
    private Boolean Mandatory;


    public E5125 e5125 = new E5125();
    public E5118 e5118 = new E5118();
    public E5375 e5375 = new E5375();
    public E5387 e5387 = new E5387();
    public E5284 e5284 = new E5284();
    public E6411 e6411 = new E6411();


    public C509() {
        e5125.setMandatory(true);
    }


    public C509(Boolean Mandatory, String s5125, String s5118, String s5375, String s5387, String s5284, String s6411) {
        this.Mandatory = Mandatory;
        e5125.setContent(s5125);
        e5125.setMandatory(true);
        e5118.setContent(s5118);
        e5375.setContent(s5375);
        e5387.setContent(s5387);
        e5284.setContent(s5284);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e5125.validate();
            e5118.validate();
            e5375.validate();
            e5387.validate();
            e5284.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5125.toString() + ":" + e5118.toString() + ":" + e5375.toString() + ":" + e5387.toString() + ":" + e5284.toString() + ":" + e6411.toString();
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

