package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C200 {
    private final String Tag = "C200";
    private final String Description = "CHARGE";
    private final String LongDescription = "Identification of a charge by code and/or by name.";
    private Boolean Mandatory;


    public E8023 e8023 = new E8023();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E8022 e8022 = new E8022();
    public E4237 e4237 = new E4237();
    public E7140 e7140 = new E7140();


    public C200() {
    }


    public C200(Boolean Mandatory, String s8023, String s1131, String s3055, String s8022, String s4237, String s7140) {
        this.Mandatory = Mandatory;
        e8023.setContent(s8023);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8022.setContent(s8022);
        e4237.setContent(s4237);
        e7140.setContent(s7140);
    }


    public void validate() throws ValidityException {
        try {
            e8023.validate();
            e1131.validate();
            e3055.validate();
            e8022.validate();
            e4237.validate();
            e7140.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8023.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e8022.toString() + ":" + e4237.toString() + ":" + e7140.toString();
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

