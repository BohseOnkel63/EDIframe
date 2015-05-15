package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C243 {
    private final String Tag = "C243";
    private final String Description = "DUTY/TAX/FEE DETAIL";
    private final String LongDescription = "Rate of duty/tax/fee applicable to commodities or of tax applicable to services.";
    private Boolean Mandatory;


    public E5279 e5279 = new E5279();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E5278 e5278 = new E5278();
    public E5273 e5273 = new E5273();
    public E1131 e1131_2 = new E1131();
    public E3055 e3055_2 = new E3055();


    public C243() {
    }


    public C243(Boolean Mandatory, String s5279, String s1131_1, String s3055_1, String s5278, String s5273, String s1131_2, String s3055_2) {
        this.Mandatory = Mandatory;
        e5279.setContent(s5279);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e5278.setContent(s5278);
        e5273.setContent(s5273);
        e1131_2.setContent(s1131_2);
        e3055_2.setContent(s3055_2);
    }


    public void validate() throws ValidityException {
        try {
            e5279.validate();
            e1131_1.validate();
            e3055_1.validate();
            e5278.validate();
            e5273.validate();
            e1131_2.validate();
            e3055_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e5279.toString() + ":" + e1131_1.toString() + ":" + e3055_1.toString() + ":" + e5278.toString() + ":" + e5273.toString() + ":" + e1131_2.toString() + ":" + e3055_2.toString();
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

