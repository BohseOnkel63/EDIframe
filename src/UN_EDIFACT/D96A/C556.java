package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C556 {
    private final String Tag = "C556";
    private final String Description = "STATUS REASON";
    private final String LongDescription = "To specify the reason behind a status event.";
    private Boolean Mandatory;


    public E9013 e9013 = new E9013();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9012 e9012 = new E9012();


    public C556() {
        e9013.setMandatory(true);
    }


    public C556(Boolean Mandatory, String s9013, String s1131, String s3055, String s9012) {
        this.Mandatory = Mandatory;
        e9013.setContent(s9013);
        e9013.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9012.setContent(s9012);
    }


    public void validate() throws ValidityException {
        try {
            e9013.validate();
            e1131.validate();
            e3055.validate();
            e9012.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9013.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e9012.toString();
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

