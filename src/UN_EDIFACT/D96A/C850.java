package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C850 {
    private final String Tag = "C850";
    private final String Description = "STATUS OF INSTRUCTION";
    private final String LongDescription = "Provides information regarding the status of an instruction.";
    private Boolean Mandatory;


    public E4405 e4405 = new E4405();
    public E3036 e3036 = new E3036();


    public C850() {
        e4405.setMandatory(true);
    }


    public C850(Boolean Mandatory, String s4405, String s3036) {
        this.Mandatory = Mandatory;
        e4405.setContent(s4405);
        e4405.setMandatory(true);
        e3036.setContent(s3036);
    }


    public void validate() throws ValidityException {
        try {
            e4405.validate();
            e3036.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4405.toString() + ":" + e3036.toString();
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

