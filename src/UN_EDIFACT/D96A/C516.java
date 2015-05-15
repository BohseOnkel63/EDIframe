package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C516 {
    private final String Tag = "C516";
    private final String Description = "MONETARY AMOUNT";
    private final String LongDescription = "Amount of goods or services stated as a monetary amount in a specified currency.";
    private Boolean Mandatory;


    public E5025 e5025 = new E5025();
    public E5004 e5004 = new E5004();
    public E6345 e6345 = new E6345();
    public E6343 e6343 = new E6343();
    public E4405 e4405 = new E4405();


    public C516() {
        e5025.setMandatory(true);
    }


    public C516(Boolean Mandatory, String s5025, String s5004, String s6345, String s6343, String s4405) {
        this.Mandatory = Mandatory;
        e5025.setContent(s5025);
        e5025.setMandatory(true);
        e5004.setContent(s5004);
        e6345.setContent(s6345);
        e6343.setContent(s6343);
        e4405.setContent(s4405);
    }


    public void validate() throws ValidityException {
        try {
            e5025.validate();
            e5004.validate();
            e6345.validate();
            e6343.validate();
            e4405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5025.toString() + ":" + e5004.toString() + ":" + e6345.toString() + ":" + e6343.toString() + ":" + e4405.toString();
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

