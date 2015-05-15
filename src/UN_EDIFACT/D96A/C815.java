package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C815 {
    private final String Tag = "C815";
    private final String Description = "ADDITIONAL SAFETY INFORMATION";
    private final String LongDescription = "To identify additional safety information.";
    private Boolean Mandatory;


    public E4039 e4039 = new E4039();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4038 e4038 = new E4038();


    public C815() {
        e4039.setMandatory(true);
    }


    public C815(Boolean Mandatory, String s4039, String s1131, String s3055, String s4038) {
        this.Mandatory = Mandatory;
        e4039.setContent(s4039);
        e4039.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4038.setContent(s4038);
    }


    public void validate() throws ValidityException {
        try {
            e4039.validate();
            e1131.validate();
            e3055.validate();
            e4038.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e4039.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e4038.toString();
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

