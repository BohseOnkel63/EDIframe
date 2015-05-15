package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C702 {
    private final String Tag = "C702";
    private final String Description = "CODE SET IDENTIFICATION";
    private final String LongDescription = "To identify a code set.";
    private Boolean Mandatory;


    public E9150 e9150 = new E9150();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C702() {
    }


    public C702(Boolean Mandatory, String s9150, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e9150.setContent(s9150);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e9150.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9150.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

