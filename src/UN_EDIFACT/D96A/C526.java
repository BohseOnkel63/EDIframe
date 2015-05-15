package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C526 {
    private final String Tag = "C526";
    private final String Description = "FREQUENCY DETAILS";
    private final String LongDescription = "Number of samples collected per specified unit of measure.";
    private Boolean Mandatory;


    public E6071 e6071 = new E6071();
    public E6072 e6072 = new E6072();
    public E6411 e6411 = new E6411();


    public C526() {
        e6071.setMandatory(true);
    }


    public C526(Boolean Mandatory, String s6071, String s6072, String s6411) {
        this.Mandatory = Mandatory;
        e6071.setContent(s6071);
        e6071.setMandatory(true);
        e6072.setContent(s6072);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e6071.validate();
            e6072.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6071.toString() + ":" + e6072.toString() + ":" + e6411.toString();
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

