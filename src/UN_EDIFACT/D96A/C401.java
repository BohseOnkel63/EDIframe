package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C401 {
    private final String Tag = "C401";
    private final String Description = "EXCESS TRANSPORTATION INFORMATION";
    private final String LongDescription = "To provide details of reason for, and responsibility for, use of transportation other than normally utilized.";
    private Boolean Mandatory;


    public E8457 e8457 = new E8457();
    public E8459 e8459 = new E8459();
    public E7130 e7130 = new E7130();


    public C401() {
        e8457.setMandatory(true);
        e8459.setMandatory(true);
    }


    public C401(Boolean Mandatory, String s8457, String s8459, String s7130) {
        this.Mandatory = Mandatory;
        e8457.setContent(s8457);
        e8457.setMandatory(true);
        e8459.setContent(s8459);
        e8459.setMandatory(true);
        e7130.setContent(s7130);
    }


    public void validate() throws ValidityException {
        try {
            e8457.validate();
            e8459.validate();
            e7130.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8457.toString() + ":" + e8459.toString() + ":" + e7130.toString();
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

