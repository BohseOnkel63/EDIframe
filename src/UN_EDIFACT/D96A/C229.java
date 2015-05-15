package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C229 {
    private final String Tag = "C229";
    private final String Description = "CHARGE CATEGORY";
    private final String LongDescription = "Identification of a category or a zone of charges.";
    private Boolean Mandatory;


    public E5237 e5237 = new E5237();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C229() {
        e5237.setMandatory(true);
    }


    public C229(Boolean Mandatory, String s5237, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5237.setContent(s5237);
        e5237.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5237.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5237.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

