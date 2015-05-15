package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C228 {
    private final String Tag = "C228";
    private final String Description = "TRANSPORT MEANS";
    private final String LongDescription = "Code and/or name identifying the type of means of transport.";
    private Boolean Mandatory;


    public E8179 e8179 = new E8179();
    public E8178 e8178 = new E8178();


    public C228() {
    }


    public C228(Boolean Mandatory, String s8179, String s8178) {
        this.Mandatory = Mandatory;
        e8179.setContent(s8179);
        e8178.setContent(s8178);
    }


    public void validate() throws ValidityException {
        try {
            e8179.validate();
            e8178.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8179.toString() + ":" + e8178.toString();
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

