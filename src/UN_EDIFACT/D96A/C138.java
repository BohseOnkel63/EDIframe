package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C138 {
    private final String Tag = "C138";
    private final String Description = "PRICE MULTIPLIER INFORMATION";
    private final String LongDescription = "Price multiplier and its identification.";
    private Boolean Mandatory;


    public E5394 e5394 = new E5394();
    public E5393 e5393 = new E5393();


    public C138() {
        e5394.setMandatory(true);
    }


    public C138(Boolean Mandatory, String s5394, String s5393) {
        this.Mandatory = Mandatory;
        e5394.setContent(s5394);
        e5394.setMandatory(true);
        e5393.setContent(s5393);
    }


    public void validate() throws ValidityException {
        try {
            e5394.validate();
            e5393.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5394.toString() + ":" + e5393.toString();
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

