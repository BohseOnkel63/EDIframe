package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C532 {
    private final String Tag = "C532";
    private final String Description = "RETURNABLE PACKAGE DETAILS";
    private final String LongDescription = "Indication of responsibility for payment and load contents of returnable packages.";
    private Boolean Mandatory;


    public E8395 e8395 = new E8395();
    public E8393 e8393 = new E8393();


    public C532() {
    }


    public C532(Boolean Mandatory, String s8395, String s8393) {
        this.Mandatory = Mandatory;
        e8395.setContent(s8395);
        e8393.setContent(s8393);
    }


    public void validate() throws ValidityException {
        try {
            e8395.validate();
            e8393.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8395.toString() + ":" + e8393.toString();
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

