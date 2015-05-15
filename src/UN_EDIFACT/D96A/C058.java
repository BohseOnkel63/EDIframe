package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C058 {
    private final String Tag = "C058";
    private final String Description = "NAME AND ADDRESS";
    private final String LongDescription = "Unstructured name and address: one to five lines.";
    private Boolean Mandatory;


    public E3124 e3124_1 = new E3124();
    public E3124 e3124_2 = new E3124();
    public E3124 e3124_3 = new E3124();
    public E3124 e3124_4 = new E3124();
    public E3124 e3124_5 = new E3124();


    public C058() {
        e3124_1.setMandatory(true);
    }


    public C058(Boolean Mandatory, String s3124_1, String s3124_2, String s3124_3, String s3124_4, String s3124_5) {
        this.Mandatory = Mandatory;
        e3124_1.setContent(s3124_1);
        e3124_1.setMandatory(true);
        e3124_2.setContent(s3124_2);
        e3124_3.setContent(s3124_3);
        e3124_4.setContent(s3124_4);
        e3124_5.setContent(s3124_5);
    }


    public void validate() throws ValidityException {
        try {
            e3124_1.validate();
            e3124_2.validate();
            e3124_3.validate();
            e3124_4.validate();
            e3124_5.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3124_1.toString() + ":" + e3124_2.toString() + ":" + e3124_3.toString() + ":" + e3124_4.toString() + ":" + e3124_5.toString();
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

