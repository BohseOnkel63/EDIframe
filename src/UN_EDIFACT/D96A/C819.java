package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C819 {
    private final String Tag = "C819";
    private final String Description = "COUNTRY SUB-ENTITY DETAILS";
    private final String LongDescription = "To specify a part of a country (eg county or part of a city).";
    private Boolean Mandatory;


    public E3229 e3229 = new E3229();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3228 e3228 = new E3228();


    public C819() {
    }


    public C819(Boolean Mandatory, String s3229, String s1131, String s3055, String s3228) {
        this.Mandatory = Mandatory;
        e3229.setContent(s3229);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3228.setContent(s3228);
    }


    public void validate() throws ValidityException {
        try {
            e3229.validate();
            e1131.validate();
            e3055.validate();
            e3228.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3229.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3228.toString();
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

