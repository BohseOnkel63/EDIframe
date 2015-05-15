package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C521 {
    private final String Tag = "C521";
    private final String Description = "BUSINESS FUNCTION";
    private final String LongDescription = "To specify a business reason.";
    private Boolean Mandatory;


    public E4027 e4027 = new E4027();
    public E4025 e4025 = new E4025();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4022 e4022 = new E4022();


    public C521() {
        e4027.setMandatory(true);
        e4025.setMandatory(true);
    }


    public C521(Boolean Mandatory, String s4027, String s4025, String s1131, String s3055, String s4022) {
        this.Mandatory = Mandatory;
        e4027.setContent(s4027);
        e4027.setMandatory(true);
        e4025.setContent(s4025);
        e4025.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4022.setContent(s4022);
    }


    public void validate() throws ValidityException {
        try {
            e4027.validate();
            e4025.validate();
            e1131.validate();
            e3055.validate();
            e4022.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4027.toString() + ":" + e4025.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4022.toString();
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

