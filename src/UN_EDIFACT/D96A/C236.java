package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C236 {
    private final String Tag = "C236";
    private final String Description = "DANGEROUS GOODS LABEL";
    private final String LongDescription = "Markings identifying the type of hazardous goods and similar information.";
    private Boolean Mandatory;


    public E8246 e8246_1 = new E8246();
    public E8246 e8246_2 = new E8246();
    public E8246 e8246_3 = new E8246();


    public C236() {
    }


    public C236(Boolean Mandatory, String s8246_1, String s8246_2, String s8246_3) {
        this.Mandatory = Mandatory;
        e8246_1.setContent(s8246_1);
        e8246_2.setContent(s8246_2);
        e8246_3.setContent(s8246_3);
    }


    public void validate() throws ValidityException {
        try {
            e8246_1.validate();
            e8246_2.validate();
            e8246_3.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8246_1.toString() + ":" + e8246_2.toString() + ":" + e8246_3.toString();
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

