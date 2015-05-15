package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C889 {
    private final String Tag = "C889";
    private final String Description = "CHARACTERISTIC VALUE";
    private final String LongDescription = "To provide the value of a characteristic.";
    private Boolean Mandatory;


    public E7111 e7111 = new E7111();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7110 e7110_1 = new E7110();
    public E7110 e7110_2 = new E7110();


    public C889() {
    }


    public C889(Boolean Mandatory, String s7111, String s1131, String s3055, String s7110_1, String s7110_2) {
        this.Mandatory = Mandatory;
        e7111.setContent(s7111);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7110_1.setContent(s7110_1);
        e7110_2.setContent(s7110_2);
    }


    public void validate() throws ValidityException {
        try {
            e7111.validate();
            e1131.validate();
            e3055.validate();
            e7110_1.validate();
            e7110_2.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7111.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e7110_1.toString() + ":" + e7110_2.toString();
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

