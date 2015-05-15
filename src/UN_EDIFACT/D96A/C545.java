package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C545 {
    private final String Tag = "C545";
    private final String Description = "INDEX IDENTIFICATION";
    private final String LongDescription = "To identify an index.";
    private Boolean Mandatory;


    public E5013 e5013 = new E5013();
    public E5027 e5027 = new E5027();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C545() {
        e5013.setMandatory(true);
    }


    public C545(Boolean Mandatory, String s5013, String s5027, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5013.setContent(s5013);
        e5013.setMandatory(true);
        e5027.setContent(s5027);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5013.validate();
            e5027.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5013.toString() + ":" + e5027.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

