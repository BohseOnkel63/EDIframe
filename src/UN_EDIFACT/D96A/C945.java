package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C945 {
    private final String Tag = "C945";
    private final String Description = "MEMBERSHIP LEVEL";
    private final String LongDescription = "Identification of a membership level.";
    private Boolean Mandatory;


    public E7455 e7455 = new E7455();
    public E7457 e7457 = new E7457();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7456 e7456 = new E7456();


    public C945() {
        e7455.setMandatory(true);
    }


    public C945(Boolean Mandatory, String s7455, String s7457, String s1131, String s3055, String s7456) {
        this.Mandatory = Mandatory;
        e7455.setContent(s7455);
        e7455.setMandatory(true);
        e7457.setContent(s7457);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7456.setContent(s7456);
    }


    public void validate() throws ValidityException {
        try {
            e7455.validate();
            e7457.validate();
            e1131.validate();
            e3055.validate();
            e7456.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7455.toString() + ":" + e7457.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7456.toString();
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

