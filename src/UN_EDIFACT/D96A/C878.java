package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C878 {
    private final String Tag = "C878";
    private final String Description = "CHARGE/ALLOWANCE ACCOUNT";
    private final String LongDescription = "Identification of the account for charge or allowance.";
    private Boolean Mandatory;


    public E3434 e3434 = new E3434();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3194 e3194 = new E3194();
    public E6345 e6345 = new E6345();


    public C878() {
        e3434.setMandatory(true);
    }


    public C878(Boolean Mandatory, String s3434, String s1131, String s3055, String s3194, String s6345) {
        this.Mandatory = Mandatory;
        e3434.setContent(s3434);
        e3434.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3194.setContent(s3194);
        e6345.setContent(s6345);
    }


    public void validate() throws ValidityException {
        try {
            e3434.validate();
            e1131.validate();
            e3055.validate();
            e3194.validate();
            e6345.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3434.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3194.toString() + ":" + e6345.toString();
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

