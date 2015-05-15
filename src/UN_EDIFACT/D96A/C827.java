package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C827 {
    private final String Tag = "C827";
    private final String Description = "TYPE OF MARKING";
    private final String LongDescription = "Specification of the type of marking that reflects the method that was used and the conventions adhered to for marking (e.g. of packages).";
    private Boolean Mandatory;


    public E7511 e7511 = new E7511();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C827() {
        e7511.setMandatory(true);
    }


    public C827(Boolean Mandatory, String s7511, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e7511.setContent(s7511);
        e7511.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e7511.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7511.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

