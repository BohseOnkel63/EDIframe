package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C703 {
    private final String Tag = "C703";
    private final String Description = "NATURE OF CARGO";
    private final String LongDescription = "Rough classification of a type of cargo.";
    private Boolean Mandatory;


    public E7085 e7085 = new E7085();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C703() {
        e7085.setMandatory(true);
    }


    public C703(Boolean Mandatory, String s7085, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e7085.setContent(s7085);
        e7085.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e7085.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7085.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

