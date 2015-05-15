package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C817 {
    private final String Tag = "C817";
    private final String Description = "ADDRESS USAGE";
    private final String LongDescription = "To describe the usage of an address.";
    private Boolean Mandatory;


    public E3299 e3299 = new E3299();
    public E3131 e3131 = new E3131();
    public E3475 e3475 = new E3475();


    public C817() {
    }


    public C817(Boolean Mandatory, String s3299, String s3131, String s3475) {
        this.Mandatory = Mandatory;
        e3299.setContent(s3299);
        e3131.setContent(s3131);
        e3475.setContent(s3475);
    }


    public void validate() throws ValidityException {
        try {
            e3299.validate();
            e3131.validate();
            e3475.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3299.toString() + ":" + e3131.toString() + ":" + e3475.toString();
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

