package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C223 {
    private final String Tag = "C223";
    private final String Description = "DANGEROUS GOODS SHIPMENT FLASHPOINT";
    private final String LongDescription = "Temperature at which a vapor according to ISO 1523/73 can be ignited.";
    private Boolean Mandatory;


    public E7106 e7106 = new E7106();
    public E6411 e6411 = new E6411();


    public C223() {
    }


    public C223(Boolean Mandatory, String s7106, String s6411) {
        this.Mandatory = Mandatory;
        e7106.setContent(s7106);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e7106.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7106.toString() + ":" + e6411.toString();
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

