package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C270 {
    private final String Tag = "C270";
    private final String Description = "CONTROL";
    private final String LongDescription = "Control total for checking integrity of a message or part of a message.";
    private Boolean Mandatory;


    public E6069 e6069 = new E6069();
    public E6066 e6066 = new E6066();
    public E6411 e6411 = new E6411();


    public C270() {
        e6069.setMandatory(true);
        e6066.setMandatory(true);
    }


    public C270(Boolean Mandatory, String s6069, String s6066, String s6411) {
        this.Mandatory = Mandatory;
        e6069.setContent(s6069);
        e6069.setMandatory(true);
        e6066.setContent(s6066);
        e6066.setMandatory(true);
        e6411.setContent(s6411);
    }


    public void validate() throws ValidityException {
        try {
            e6069.validate();
            e6066.validate();
            e6411.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6069.toString() + ":" + e6066.toString() + ":" + e6411.toString();
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

