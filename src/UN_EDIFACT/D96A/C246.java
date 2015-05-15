package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C246 {
    private final String Tag = "C246";
    private final String Description = "CUSTOMS IDENTITY CODES";
    private final String LongDescription = "Specification of goods in terms of customs identity.";
    private Boolean Mandatory;


    public E7361 e7361 = new E7361();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C246() {
        e7361.setMandatory(true);
    }


    public C246(Boolean Mandatory, String s7361, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e7361.setContent(s7361);
        e7361.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e7361.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7361.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

