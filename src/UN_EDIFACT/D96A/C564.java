package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C564 {
    private final String Tag = "C564";
    private final String Description = "PHYSICAL OR LOGICAL STATE INFORMATION";
    private final String LongDescription = "To give information in coded or clear text form on the physical or logical state.";
    private Boolean Mandatory;


    public E7007 e7007 = new E7007();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7006 e7006 = new E7006();


    public C564() {
    }


    public C564(Boolean Mandatory, String s7007, String s1131, String s3055, String s7006) {
        this.Mandatory = Mandatory;
        e7007.setContent(s7007);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7006.setContent(s7006);
    }


    public void validate() throws ValidityException {
        try {
            e7007.validate();
            e1131.validate();
            e3055.validate();
            e7006.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7007.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7006.toString();
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

