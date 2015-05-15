package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C292 {
    private final String Tag = "C292";
    private final String Description = "PRICE CHANGE INFORMATION";
    private final String LongDescription = "A value assigned by the seller to indicate movement of prices from a previous price catalogue.";
    private Boolean Mandatory;


    public E5377 e5377 = new E5377();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C292() {
        e5377.setMandatory(true);
    }


    public C292(Boolean Mandatory, String s5377, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5377.setContent(s5377);
        e5377.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5377.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5377.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

