package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C501 {
    private final String Tag = "C501";
    private final String Description = "PERCENTAGE DETAILS";
    private final String LongDescription = "Percentage relating to a specified basis.";
    private Boolean Mandatory;


    public E5245 e5245 = new E5245();
    public E5482 e5482 = new E5482();
    public E5249 e5249 = new E5249();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C501() {
        e5245.setMandatory(true);
    }


    public C501(Boolean Mandatory, String s5245, String s5482, String s5249, String s1131, String s3055) {
        this.Mandatory = Mandatory;
        e5245.setContent(s5245);
        e5245.setMandatory(true);
        e5482.setContent(s5482);
        e5249.setContent(s5249);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


    public void validate() throws ValidityException {
        try {
            e5245.validate();
            e5482.validate();
            e5249.validate();
            e1131.validate();
            e3055.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5245.toString() + ":" + e5482.toString() + ":" + e5249.toString() + ":" + e1131.toString() + ":" + e3055.toString();
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

