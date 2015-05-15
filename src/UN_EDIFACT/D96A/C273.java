package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C273 {
    private final String Tag = "C273";
    private final String Description = "ITEM DESCRIPTION";
    private final String LongDescription = "Description of an item.";
    private Boolean Mandatory;


    public E7009 e7009 = new E7009();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7008 e7008_1 = new E7008();
    public E7008 e7008_2 = new E7008();
    public E3453 e3453 = new E3453();


    public C273() {
    }


    public C273(Boolean Mandatory, String s7009, String s1131, String s3055, String s7008_1, String s7008_2, String s3453) {
        this.Mandatory = Mandatory;
        e7009.setContent(s7009);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7008_1.setContent(s7008_1);
        e7008_2.setContent(s7008_2);
        e3453.setContent(s3453);
    }


    public void validate() throws ValidityException {
        try {
            e7009.validate();
            e1131.validate();
            e3055.validate();
            e7008_1.validate();
            e7008_2.validate();
            e3453.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7009.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7008_1.toString() + ":" + e7008_2.toString() + ":" + e3453.toString();
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

