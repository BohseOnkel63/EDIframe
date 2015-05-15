package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C235 {
    private final String Tag = "C235";
    private final String Description = "HAZARD IDENTIFICATION";
    private final String LongDescription = "Identification of the Orange placard required on the means of transport.";
    private Boolean Mandatory;


    public E8158 e8158 = new E8158();
    public E8186 e8186 = new E8186();


    public C235() {
    }


    public C235(Boolean Mandatory, String s8158, String s8186) {
        this.Mandatory = Mandatory;
        e8158.setContent(s8158);
        e8186.setContent(s8186);
    }


    public void validate() throws ValidityException {
        try {
            e8158.validate();
            e8186.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8158.toString() + ":" + e8186.toString();
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

