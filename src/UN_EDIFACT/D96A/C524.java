package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C524 {
    private final String Tag = "C524";
    private final String Description = "HANDLING INSTRUCTIONS";
    private final String LongDescription = "Instruction for the handling of goods, products or articles in shipment, storage etc.";
    private Boolean Mandatory;


    public E4079 e4079 = new E4079();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4078 e4078 = new E4078();


    public C524() {
    }


    public C524(Boolean Mandatory, String s4079, String s1131, String s3055, String s4078) {
        this.Mandatory = Mandatory;
        e4079.setContent(s4079);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4078.setContent(s4078);
    }


    public void validate() throws ValidityException {
        try {
            e4079.validate();
            e1131.validate();
            e3055.validate();
            e4078.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4079.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4078.toString();
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

