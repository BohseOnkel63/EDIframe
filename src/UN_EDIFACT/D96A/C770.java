package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C770 {
    private final String Tag = "C770";
    private final String Description = "ARRAY CELL DETAILS";
    private final String LongDescription = "To contain the data for a contiguous set of cells in an array.";
    private Boolean Mandatory;


    public E9424 e9424 = new E9424();


    public C770() {
    }


    public C770(Boolean Mandatory, String s9424) {
        this.Mandatory = Mandatory;
        e9424.setContent(s9424);
    }


    public void validate() throws ValidityException {
        try {
            e9424.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e9424.toString();
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

