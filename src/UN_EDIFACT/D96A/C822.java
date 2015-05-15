package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C822 {
    private final String Tag = "C822";
    private final String Description = "DAMAGE AREA";
    private final String LongDescription = "To specify where the damage is on an object.";
    private Boolean Mandatory;


    public E7503 e7503 = new E7503();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7502 e7502 = new E7502();


    public C822() {
    }


    public C822(Boolean Mandatory, String s7503, String s1131, String s3055, String s7502) {
        this.Mandatory = Mandatory;
        e7503.setContent(s7503);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7502.setContent(s7502);
    }


    public void validate() throws ValidityException {
        try {
            e7503.validate();
            e1131.validate();
            e3055.validate();
            e7502.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7503.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7502.toString();
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

