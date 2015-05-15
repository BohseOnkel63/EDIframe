package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C823 {
    private final String Tag = "C823";
    private final String Description = "TYPE OF UNIT/COMPONENT";
    private final String LongDescription = "To identify the type of unit/component of an object (e.g. lock, door, tyre).";
    private Boolean Mandatory;


    public E7505 e7505 = new E7505();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7504 e7504 = new E7504();


    public C823() {
    }


    public C823(Boolean Mandatory, String s7505, String s1131, String s3055, String s7504) {
        this.Mandatory = Mandatory;
        e7505.setContent(s7505);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7504.setContent(s7504);
    }


    public void validate() throws ValidityException {
        try {
            e7505.validate();
            e1131.validate();
            e3055.validate();
            e7504.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7505.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7504.toString();
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

