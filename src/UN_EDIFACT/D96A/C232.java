package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C232 {
    private final String Tag = "C232";
    private final String Description = "GOVERNMENT ACTION";
    private final String LongDescription = "Code indicating a type of government action.";
    private Boolean Mandatory;


    public E9415 e9415 = new E9415();
    public E9411 e9411 = new E9411();
    public E9417 e9417 = new E9417();
    public E9353 e9353 = new E9353();


    public C232() {
    }


    public C232(Boolean Mandatory, String s9415, String s9411, String s9417, String s9353) {
        this.Mandatory = Mandatory;
        e9415.setContent(s9415);
        e9411.setContent(s9411);
        e9417.setContent(s9417);
        e9353.setContent(s9353);
    }


    public void validate() throws ValidityException {
        try {
            e9415.validate();
            e9411.validate();
            e9417.validate();
            e9353.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9415.toString() + ":" + e9411.toString() + ":" + e9417.toString() + ":" + e9353.toString();
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

