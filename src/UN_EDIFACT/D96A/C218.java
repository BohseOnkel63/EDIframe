package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C218 {
    private final String Tag = "C218";
    private final String Description = "HAZARDOUS MATERIAL";
    private final String LongDescription = "Hazardous material code from a specified source.";
    private Boolean Mandatory;


    public E7419 e7419 = new E7419();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C218() {
    }


    public C218(Boolean Mandatory, String s7419, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e7419.setContent(s7419);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e7419.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7419.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

