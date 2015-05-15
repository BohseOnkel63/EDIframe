package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C537 {
    private final String Tag = "C537";
    private final String Description = "TRANSPORT PRIORITY";
    private final String LongDescription = "To indicate the priority of requested transport service.";
    private Boolean Mandatory;


    public E4219 e4219 = new E4219();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C537() {
        e4219.setMandatory(true);
    }


    public C537(Boolean Mandatory, String s4219, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e4219.setContent(s4219);
        e4219.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e4219.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4219.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

