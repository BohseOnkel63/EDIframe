package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C829 {
    private final String Tag = "C829";
    private final String Description = "SUB-LINE INFORMATION";
    private final String LongDescription = "To provide an indication that a segment or segment group is used to contain sub-line or sub-line item information and to optionally enable the sub-line to be identified.";
    private Boolean Mandatory;


    public E5495 e5495 = new E5495();
    public E1082 e1082 = new E1082();


    public C829() {
    }


    public C829(Boolean Mandatory, String s5495, String s1082) {
        this.Mandatory = Mandatory;
        e5495.setContent(s5495);
        e1082.setContent(s1082);
    }


    public void validate() throws ValidityException {
        try {
            e5495.validate();
            e1082.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5495.toString() + ":" + e1082.toString();
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

