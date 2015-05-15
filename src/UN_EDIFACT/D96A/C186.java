package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C186 {
    private final String Tag = "C186";
    private final String Description = "QUANTITY DETAILS";
    private final String LongDescription = "Quantity information in a transaction, qualified when relevant.";
    private Boolean Mandatory;


    public E6063 e6063 = new E6063();
    public E6060 e6060 = new E6060();
    public E6411 e6411 = new E6411();


    public C186() {
        e6063.setMandatory(true);
        e6060.setMandatory(true);
    }


    public C186(Boolean Mandatory, String s6063, String s6060, String s6411) {
        this.Mandatory = Mandatory;
        e6063.setContent(s6063);
        e6063.setMandatory(true);
        e6060.setContent(s6060);
        e6060.setMandatory(true);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e6063.validate();
            e6060.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6063.toString() + ":" + e6060.toString() + ":" + e6411.toString();
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

