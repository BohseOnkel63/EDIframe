package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C849 {
    private final String Tag = "C849";
    private final String Description = "PARTIES TO INSTRUCTION";
    private final String LongDescription = "Identify the sending and receiving parties of the instruction.";
    private Boolean Mandatory;


    public E3301 e3301 = new E3301();
    public E3285 e3285 = new E3285();


    public C849() {
        e3301.setMandatory(true);
    }


    public C849(Boolean Mandatory, String s3301, String s3285) {
        this.Mandatory = Mandatory;
        e3301.setContent(s3301);
        e3301.setMandatory(true);
        e3285.setContent(s3285);
    }


    public void validate() throws ValidityException {
        try {
            e3301.validate();
            e3285.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3301.toString() + ":" + e3285.toString();
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

