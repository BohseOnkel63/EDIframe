package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C546 {
    private final String Tag = "C546";
    private final String Description = "INDEX VALUE";
    private final String LongDescription = "To identify the value of an index.";
    private Boolean Mandatory;


    public E5030 e5030 = new E5030();
    public E5039 e5039 = new E5039();


    public C546() {
        e5030.setMandatory(true);
    }


    public C546(Boolean Mandatory, String s5030, String s5039) {
        this.Mandatory = Mandatory;
        e5030.setContent(s5030);
        e5030.setMandatory(true);
        e5039.setContent(s5039);
    }


    public void validate() throws ValidityException {
        try {
            e5030.validate();
            e5039.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5030.toString() + ":" + e5039.toString();
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

