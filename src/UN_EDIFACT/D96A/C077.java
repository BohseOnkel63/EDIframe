package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C077 {
    private final String Tag = "C077";
    private final String Description = "FILE IDENTIFICATION";
    private final String LongDescription = "To identify a file.";
    private Boolean Mandatory;


    public E1508 e1508 = new E1508();
    public E7008 e7008 = new E7008();


    public C077() {
    }


    public C077(Boolean Mandatory, String s1508, String s7008) {
        this.Mandatory = Mandatory;
        e1508.setContent(s1508);
        e7008.setContent(s7008);
    }


    public void validate() throws ValidityException {
        try {
            e1508.validate();
            e7008.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e1508.toString() + ":" + e7008.toString();
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

