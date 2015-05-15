package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C825 {
    private final String Tag = "C825";
    private final String Description = "DAMAGE SEVERITY";
    private final String LongDescription = "To specify the severity of damage to an object.";
    private Boolean Mandatory;


    public E7509 e7509 = new E7509();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7508 e7508 = new E7508();


    public C825() {
    }


    public C825(Boolean Mandatory, String s7509, String s1131, String s3055, String s7508) {
        this.Mandatory = Mandatory;
        e7509.setContent(s7509);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7508.setContent(s7508);
    }


    public void validate() throws ValidityException {
        try {
            e7509.validate();
            e1131.validate();
            e3055.validate();
            e7508.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7509.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7508.toString();
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

