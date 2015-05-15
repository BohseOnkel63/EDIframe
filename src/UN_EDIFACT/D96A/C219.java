package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C219 {
    private final String Tag = "C219";
    private final String Description = "MOVEMENT TYPE";
    private final String LongDescription = "Description of type of service for movement of cargo.";
    private Boolean Mandatory;


    public E8335 e8335 = new E8335();
    public E8334 e8334 = new E8334();


    public C219() {
    }


    public C219(Boolean Mandatory, String s8335, String s8334) {
        this.Mandatory = Mandatory;
        e8335.setContent(s8335);
        e8334.setContent(s8334);
    }


    public void validate() throws ValidityException {
        try {
            e8335.validate();
            e8334.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8335.toString() + ":" + e8334.toString();
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

