package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C824 {
    private final String Tag = "C824";
    private final String Description = "COMPONENT MATERIAL";
    private final String LongDescription = "To identify the material of which a component is composed (e.g. steel, plastics).";
    private Boolean Mandatory;


    public E7507 e7507 = new E7507();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7506 e7506 = new E7506();


    public C824() {
    }


    public C824(Boolean Mandatory, String s7507, String s1131, String s3055, String s7506) {
        this.Mandatory = Mandatory;
        e7507.setContent(s7507);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7506.setContent(s7506);
    }


    public void validate() throws ValidityException {
        try {
            e7507.validate();
            e1131.validate();
            e3055.validate();
            e7506.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7507.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7506.toString();
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

