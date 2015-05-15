package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C279 {
    private final String Tag = "C279";
    private final String Description = "QUANTITY DIFFERENCE INFORMATION";
    private final String LongDescription = "Information on quantity difference.";
    private Boolean Mandatory;


    public E6064 e6064 = new E6064();
    public E6063 e6063 = new E6063();


    public C279() {
        e6064.setMandatory(true);
    }


    public C279(Boolean Mandatory, String s6064, String s6063) {
        this.Mandatory = Mandatory;
        e6064.setContent(s6064);
        e6064.setMandatory(true);
        e6063.setContent(s6063);
    }


    public void validate() throws ValidityException {
        try {
            e6064.validate();
            e6063.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6064.toString() + ":" + e6063.toString();
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

