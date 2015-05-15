package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C239 {
    private final String Tag = "C239";
    private final String Description = "TEMPERATURE SETTING";
    private final String LongDescription = "The temperature under which the goods are (to be) stored or shipped.";
    private Boolean Mandatory;


    public E6246 e6246 = new E6246();
    public E6411 e6411 = new E6411();


    public C239() {
    }


    public C239(Boolean Mandatory, String s6246, String s6411) {
        this.Mandatory = Mandatory;
        e6246.setContent(s6246);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e6246.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6246.toString() + ":" + e6411.toString();
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

