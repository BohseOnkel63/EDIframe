package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C208 {
    private final String Tag = "C208";
    private final String Description = "IDENTITY NUMBER RANGE";
    private final String LongDescription = "Goods item identification numbers, start and end of consecutively numbered range.";
    private Boolean Mandatory;


    public E7402 e7402_1 = new E7402();
    public E7402 e7402_2 = new E7402();


    public C208() {
        e7402_1.setMandatory(true);
    }


    public C208(Boolean Mandatory, String s7402_1, String s7402_2) {
        this.Mandatory = Mandatory;
        e7402_1.setContent(s7402_1);
        e7402_1.setMandatory(true);
        e7402_2.setContent(s7402_2);
    }


    public void validate() throws ValidityException {
        try {
            e7402_1.validate();
            e7402_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7402_1.toString() + ":" + e7402_2.toString();
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

