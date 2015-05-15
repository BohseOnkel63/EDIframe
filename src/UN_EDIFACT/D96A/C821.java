package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C821 {
    private final String Tag = "C821";
    private final String Description = "TYPE OF DAMAGE";
    private final String LongDescription = "To specify the type of damage to an object.";
    private Boolean Mandatory;


    public E7501 e7501 = new E7501();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7500 e7500 = new E7500();


    public C821() {
    }


    public C821(Boolean Mandatory, String s7501, String s1131, String s3055, String s7500) {
        this.Mandatory = Mandatory;
        e7501.setContent(s7501);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7500.setContent(s7500);
    }


    public void validate() throws ValidityException {
        try {
            e7501.validate();
            e1131.validate();
            e3055.validate();
            e7500.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7501.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7500.toString();
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

