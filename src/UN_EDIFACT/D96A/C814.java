package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C814 {
    private final String Tag = "C814";
    private final String Description = "SAFETY SECTION";
    private final String LongDescription = "To identify the safety section to which information relates.";
    private Boolean Mandatory;


    public E4046 e4046 = new E4046();
    public E4044 e4044 = new E4044();


    public C814() {
        e4046.setMandatory(true);
    }


    public C814(Boolean Mandatory, String s4046, String s4044) {
        this.Mandatory = Mandatory;
        e4046.setContent(s4046);
        e4046.setMandatory(true);
        e4044.setContent(s4044);
    }


    public void validate() throws ValidityException {
        try {
            e4046.validate();
            e4044.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4046.toString() + ":" + e4044.toString();
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

