package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C955 {
    private final String Tag = "C955";
    private final String Description = "ATTRIBUTE TYPE";
    private final String LongDescription = "Identification of the type of attribute.";
    private Boolean Mandatory;


    public E9021 e9021 = new E9021();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C955() {
        e9021.setMandatory(true);
    }


    public C955(Boolean Mandatory, String s9021, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e9021.setContent(s9021);
        e9021.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e9021.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9021.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

