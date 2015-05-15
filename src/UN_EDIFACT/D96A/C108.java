package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C108 {
    private final String Tag = "C108";
    private final String Description = "TEXT LITERAL";
    private final String LongDescription = "Free text; one to five lines.";
    private Boolean Mandatory;


    public E4440 e4440_1 = new E4440();
    public E4440 e4440_2 = new E4440();
    public E4440 e4440_3 = new E4440();
    public E4440 e4440_4 = new E4440();
    public E4440 e4440_5 = new E4440();


    public C108() {
        e4440_1.setMandatory(true);
    }


    public C108(Boolean Mandatory, String s4440_1, String s4440_2, String s4440_3, String s4440_4, String s4440_5) {
        this.Mandatory = Mandatory;
        e4440_1.setContent(s4440_1);
        e4440_1.setMandatory(true);
        e4440_2.setContent(s4440_2);
        e4440_3.setContent(s4440_3);
        e4440_4.setContent(s4440_4);
        e4440_5.setContent(s4440_5);
    }


    public void validate() throws ValidityException {
        try {
            e4440_1.validate();
            e4440_2.validate();
            e4440_3.validate();
            e4440_4.validate();
            e4440_5.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4440_1.toString() + ":" + e4440_2.toString() + ":" + e4440_3.toString() + ":" + e4440_4.toString() + ":" + e4440_5.toString();
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

