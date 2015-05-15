package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C780 {
    private final String Tag = "C780";
    private final String Description = "VALUE LIST IDENTIFICATION";
    private final String LongDescription = "The identification of a coded or non coded value list.";
    private Boolean Mandatory;


    public E1518 e1518 = new E1518();
    public E7405 e7405 = new E7405();


    public C780() {
        e1518.setMandatory(true);
    }


    public C780(Boolean Mandatory, String s1518, String s7405) {
        this.Mandatory = Mandatory;
        e1518.setContent(s1518);
        e1518.setMandatory(true);
        e7405.setContent(s7405);
    }


    public void validate() throws ValidityException {
        try {
            e1518.validate();
            e7405.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1518.toString() + ":" + e7405.toString();
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

