package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C950 {
    private final String Tag = "C950";
    private final String Description = "QUALIFICATION CLASSIFICATION";
    private final String LongDescription = "Qualification classification description and/or code. This specifies the trade, skill, professional or similar qualification category.";
    private Boolean Mandatory;


    public E9007 e9007 = new E9007();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9006 e9006_1 = new E9006();
    public E9006 e9006_2 = new E9006();


    public C950() {
    }


    public C950(Boolean Mandatory, String s9007, String s1131, String s3055, String s9006_1, String s9006_2) {
        this.Mandatory = Mandatory;
        e9007.setContent(s9007);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9006_1.setContent(s9006_1);
        e9006_2.setContent(s9006_2);
    }


    public void validate() throws ValidityException {
        try {
            e9007.validate();
            e1131.validate();
            e3055.validate();
            e9006_1.validate();
            e9006_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9007.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9006_1.toString() + ":" + e9006_2.toString();
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

