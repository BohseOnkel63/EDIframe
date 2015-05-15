package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C112 {
    private final String Tag = "C112";
    private final String Description = "TERMS/TIME INFORMATION";
    private final String LongDescription = "Time details in payment terms.";
    private Boolean Mandatory;


    public E2475 e2475 = new E2475();
    public E2009 e2009 = new E2009();
    public E2151 e2151 = new E2151();
    public E2152 e2152 = new E2152();


    public C112() {
        e2475.setMandatory(true);
    }


    public C112(Boolean Mandatory, String s2475, String s2009, String s2151, String s2152) {
        this.Mandatory = Mandatory;
        e2475.setContent(s2475);
        e2475.setMandatory(true);
        e2009.setContent(s2009);
        e2151.setContent(s2151);
        e2152.setContent(s2152);
    }


    public void validate() throws ValidityException {
        try {
            e2475.validate();
            e2009.validate();
            e2151.validate();
            e2152.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e2475.toString() + ":" + e2009.toString() + ":" + e2151.toString() + ":" + e2152.toString();
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

