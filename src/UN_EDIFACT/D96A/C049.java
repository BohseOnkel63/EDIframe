package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C049 {
    private final String Tag = "C049";
    private final String Description = "REMUNERATION TYPE IDENTIFICATION";
    private final String LongDescription = "Identification of the type of a remuneration.";
    private Boolean Mandatory;


    public E5315 e5315 = new E5315();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5314 e5314_1 = new E5314();
    public E5314 e5314_2 = new E5314();


    public C049() {
    }


    public C049(Boolean Mandatory, String s5315, String s1131, String s3055, String s5314_1, String s5314_2) {
        this.Mandatory = Mandatory;
        e5315.setContent(s5315);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5314_1.setContent(s5314_1);
        e5314_2.setContent(s5314_2);
    }


    public void validate() throws ValidityException {
        try {
            e5315.validate();
            e1131.validate();
            e3055.validate();
            e5314_1.validate();
            e5314_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5315.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e5314_1.toString() + ":" + e5314_2.toString();
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

