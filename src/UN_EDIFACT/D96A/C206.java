package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C206 {
    private final String Tag = "C206";
    private final String Description = "IDENTIFICATION NUMBER";
    private final String LongDescription = "The identification of an object.";
    private Boolean Mandatory;


    public E7402 e7402 = new E7402();
    public E7405 e7405 = new E7405();
    public E4405 e4405 = new E4405();


    public C206() {
        e7402.setMandatory(true);
    }


    public C206(Boolean Mandatory, String s7402, String s7405, String s4405) {
        this.Mandatory = Mandatory;
        e7402.setContent(s7402);
        e7402.setMandatory(true);
        e7405.setContent(s7405);
        e4405.setContent(s4405);
    }


    public void validate() throws ValidityException {
        try {
            e7402.validate();
            e7405.validate();
            e4405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7402.toString() + ":" + e7405.toString() + ":" + e4405.toString();
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

