package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C506 {
    private final String Tag = "C506";
    private final String Description = "REFERENCE";
    private final String LongDescription = "Identification of a reference.";
    private Boolean Mandatory;


    public E1153 e1153 = new E1153();
    public E1154 e1154 = new E1154();
    public E1156 e1156 = new E1156();
    public E4000 e4000 = new E4000();


    public C506() {
        e1153.setMandatory(true);
    }


    public C506(Boolean Mandatory, String s1153, String s1154, String s1156, String s4000) {
        this.Mandatory = Mandatory;
        e1153.setContent(s1153);
        e1153.setMandatory(true);
        e1154.setContent(s1154);
        e1156.setContent(s1156);
        e4000.setContent(s4000);
    }


    public void validate() throws ValidityException {
        try {
            e1153.validate();
            e1154.validate();
            e1156.validate();
            e4000.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1153.toString() + ":" + e1154.toString() + ":" + e1156.toString() + ":" + e4000.toString();
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

