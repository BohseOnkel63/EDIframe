package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C211 {
    private final String Tag = "C211";
    private final String Description = "DIMENSIONS";
    private final String LongDescription = "Specification of the dimensions of a transportable unit.";
    private Boolean Mandatory;


    public E6411 e6411 = new E6411();
    public E6168 e6168 = new E6168();
    public E6140 e6140 = new E6140();
    public E6008 e6008 = new E6008();


    public C211() {
        e6411.setMandatory(true);
    }


    public C211(Boolean Mandatory, String s6411, String s6168, String s6140, String s6008) {
        this.Mandatory = Mandatory;
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6168.setContent(s6168);
        e6140.setContent(s6140);
        e6008.setContent(s6008);
    }


    public void validate() throws ValidityException {
        try {
            e6411.validate();
            e6168.validate();
            e6140.validate();
            e6008.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6411.toString() + ":" + e6168.toString() + ":" + e6140.toString() + ":" + e6008.toString();
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

