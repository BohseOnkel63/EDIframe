package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C948 {
    private final String Tag = "C948";
    private final String Description = "EMPLOYMENT CATEGORY";
    private final String LongDescription = "Code and/or description of an employment category.";
    private Boolean Mandatory;


    public E9005 e9005 = new E9005();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9004 e9004 = new E9004();


    public C948() {
    }


    public C948(Boolean Mandatory, String s9005, String s1131, String s3055, String s9004) {
        this.Mandatory = Mandatory;
        e9005.setContent(s9005);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9004.setContent(s9004);
    }


    public void validate() throws ValidityException {
        try {
            e9005.validate();
            e1131.validate();
            e3055.validate();
            e9004.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9005.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9004.toString();
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

