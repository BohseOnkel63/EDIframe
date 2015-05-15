package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C214 {
    private final String Tag = "C214";
    private final String Description = "SPECIAL SERVICES IDENTIFICATION";
    private final String LongDescription = "Identification of a special service by a code from a specified source or by description.";
    private Boolean Mandatory;


    public E7161 e7161 = new E7161();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7160 e7160_1 = new E7160();
    public E7160 e7160_2 = new E7160();


    public C214() {
    }


    public C214(Boolean Mandatory, String s7161, String s1131, String s3055, String s7160_1, String s7160_2) {
        this.Mandatory = Mandatory;
        e7161.setContent(s7161);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7160_1.setContent(s7160_1);
        e7160_2.setContent(s7160_2);
    }


    public void validate() throws ValidityException {
        try {
            e7161.validate();
            e1131.validate();
            e3055.validate();
            e7160_1.validate();
            e7160_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7161.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7160_1.toString() + ":" + e7160_2.toString();
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

