package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C549 {
    private final String Tag = "C549";
    private final String Description = "MONETARY FUNCTION";
    private final String LongDescription = "To identify the function of a related monetary amount.";
    private Boolean Mandatory;


    public E5007 e5007 = new E5007();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C549() {
        e5007.setMandatory(true);
    }


    public C549(Boolean Mandatory, String s5007, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5007.setContent(s5007);
        e5007.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5007.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5007.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

