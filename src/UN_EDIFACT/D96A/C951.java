package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C951 {
    private final String Tag = "C951";
    private final String Description = "OCCUPATION";
    private final String LongDescription = "Description of an occupation.";
    private Boolean Mandatory;


    public E9009 e9009 = new E9009();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9008 e9008_1 = new E9008();
    public E9008 e9008_2 = new E9008();


    public C951() {
    }


    public C951(Boolean Mandatory, String s9009, String s1131, String s3055, String s9008_1, String s9008_2) {
        this.Mandatory = Mandatory;
        e9009.setContent(s9009);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9008_1.setContent(s9008_1);
        e9008_2.setContent(s9008_2);
    }


    public void validate() throws ValidityException {
        try {
            e9009.validate();
            e1131.validate();
            e3055.validate();
            e9008_1.validate();
            e9008_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9009.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9008_1.toString() + ":" + e9008_2.toString();
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

