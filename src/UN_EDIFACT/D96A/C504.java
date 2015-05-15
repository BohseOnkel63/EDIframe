package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C504 {
    private final String Tag = "C504";
    private final String Description = "CURRENCY DETAILS";
    private final String LongDescription = "The usage to which a currency relates.";
    private Boolean Mandatory;


    public E6347 e6347 = new E6347();
    public E6345 e6345 = new E6345();
    public E6343 e6343 = new E6343();
    public E6348 e6348 = new E6348();


    public C504() {
        e6347.setMandatory(true);
    }


    public C504(Boolean Mandatory, String s6347, String s6345, String s6343, String s6348) {
        this.Mandatory = Mandatory;
        e6347.setContent(s6347);
        e6347.setMandatory(true);
        e6345.setContent(s6345);
        e6343.setContent(s6343);
        e6348.setContent(s6348);
    }


    public void validate() throws ValidityException {
        try {
            e6347.validate();
            e6345.validate();
            e6343.validate();
            e6348.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6347.toString() + ":" + e6345.toString() + ":" + e6343.toString() + ":" + e6348.toString();
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

