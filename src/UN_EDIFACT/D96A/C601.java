package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C601 {
    private final String Tag = "C601";
    private final String Description = "STATUS TYPE";
    private final String LongDescription = "To specify the type of status in relation to an industry sector or business function.";
    private Boolean Mandatory;


    public E9015 e9015 = new E9015();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C601() {
        e9015.setMandatory(true);
    }


    public C601(Boolean Mandatory, String s9015, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e9015.setContent(s9015);
        e9015.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e9015.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9015.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

