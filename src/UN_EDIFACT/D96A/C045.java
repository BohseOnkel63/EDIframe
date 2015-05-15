package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C045 {
    private final String Tag = "C045";
    private final String Description = "BILL LEVEL IDENTIFICATION";
    private final String LongDescription = "A sequenced collection of facetted codes used for multiple indexing purposes.";
    private Boolean Mandatory;


    public E7436 e7436 = new E7436();
    public E7438 e7438 = new E7438();
    public E7440 e7440 = new E7440();
    public E7442 e7442 = new E7442();
    public E7444 e7444 = new E7444();
    public E7446 e7446 = new E7446();


    public C045() {
    }


    public C045(Boolean Mandatory, String s7436, String s7438, String s7440, String s7442, String s7444, String s7446) {
        this.Mandatory = Mandatory;
        e7436.setContent(s7436);
        e7438.setContent(s7438);
        e7440.setContent(s7440);
        e7442.setContent(s7442);
        e7444.setContent(s7444);
        e7446.setContent(s7446);
    }


    public void validate() throws ValidityException {
        try {
            e7436.validate();
            e7438.validate();
            e7440.validate();
            e7442.validate();
            e7444.validate();
            e7446.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7436.toString() + ":" + e7438.toString() + ":" + e7440.toString() + ":" + e7442.toString() + ":" + e7444.toString() + ":" + e7446.toString();
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

