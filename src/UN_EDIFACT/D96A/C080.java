package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C080 {
    private final String Tag = "C080";
    private final String Description = "PARTY NAME";
    private final String LongDescription = "Identification of a transaction party by name, one to five lines. Party name may be formatted.";
    private Boolean Mandatory;


    public E3036 e3036_1 = new E3036();
    public E3036 e3036_2 = new E3036();
    public E3036 e3036_3 = new E3036();
    public E3036 e3036_4 = new E3036();
    public E3036 e3036_5 = new E3036();
    public E3045 e3045 = new E3045();


    public C080() {
        e3036_1.setMandatory(true);
    }


    public C080(Boolean Mandatory, String s3036_1, String s3036_2, String s3036_3, String s3036_4, String s3036_5, String s3045) {
        this.Mandatory = Mandatory;
        e3036_1.setContent(s3036_1);
        e3036_1.setMandatory(true);
        e3036_2.setContent(s3036_2);
        e3036_3.setContent(s3036_3);
        e3036_4.setContent(s3036_4);
        e3036_5.setContent(s3036_5);
        e3045.setContent(s3045);
    }


    public void validate() throws ValidityException {
        try {
            e3036_1.validate();
            e3036_2.validate();
            e3036_3.validate();
            e3036_4.validate();
            e3036_5.validate();
            e3045.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3036_1.toString() + ":" + e3036_2.toString() + ":" + e3036_3.toString() + ":" + e3036_4.toString() + ":" + e3036_5.toString() + ":" + e3045.toString();
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

