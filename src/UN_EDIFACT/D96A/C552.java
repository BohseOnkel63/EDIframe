package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C552 {
    private final String Tag = "C552";
    private final String Description = "ALLOWANCE/CHARGE INFORMATION";
    private final String LongDescription = "Identification of allowance/charge information by number and/or code.";
    private Boolean Mandatory;


    public E1230 e1230 = new E1230();
    public E5189 e5189 = new E5189();


    public C552() {
    }


    public C552(Boolean Mandatory, String s1230, String s5189) {
        this.Mandatory = Mandatory;
        e1230.setContent(s1230);
        e5189.setContent(s5189);
    }


    public void validate() throws ValidityException {
        try {
            e1230.validate();
            e5189.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1230.toString() + ":" + e5189.toString();
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

