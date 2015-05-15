package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C901 {
    private final String Tag = "C901";
    private final String Description = "APPLICATION ERROR DETAIL";
    private final String LongDescription = "Code assigned by the recipient of a message to indicate a data validation error condition.";
    private Boolean Mandatory;


    public E9321 e9321 = new E9321();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C901() {
        e9321.setMandatory(true);
    }


    public C901(Boolean Mandatory, String s9321, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e9321.setContent(s9321);
        e9321.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e9321.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9321.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

