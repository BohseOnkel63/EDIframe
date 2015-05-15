package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C090 {
    private final String Tag = "C090";
    private final String Description = "ADDRESS DETAILS";
    private final String LongDescription = "To specify the details of an address.";
    private Boolean Mandatory;


    public E3477 e3477 = new E3477();
    public E3286 e3286_1 = new E3286();
    public E3286 e3286_2 = new E3286();
    public E3286 e3286_3 = new E3286();
    public E3286 e3286_4 = new E3286();
    public E3286 e3286_5 = new E3286();


    public C090() {
        e3477.setMandatory(true);
        e3286_1.setMandatory(true);
    }


    public C090(Boolean Mandatory, String s3477, String s3286_1, String s3286_2, String s3286_3, String s3286_4, String s3286_5) {
        this.Mandatory = Mandatory;
        e3477.setContent(s3477);
        e3477.setMandatory(true);
        e3286_1.setContent(s3286_1);
        e3286_1.setMandatory(true);
        e3286_2.setContent(s3286_2);
        e3286_3.setContent(s3286_3);
        e3286_4.setContent(s3286_4);
        e3286_5.setContent(s3286_5);
    }


    public void validate() throws ValidityException {
        try {
            e3477.validate();
            e3286_1.validate();
            e3286_2.validate();
            e3286_3.validate();
            e3286_4.validate();
            e3286_5.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3477.toString() + ":" + e3286_1.toString() + ":" + e3286_2.toString() + ":" + e3286_3.toString() + ":" + e3286_4.toString() + ":" + e3286_5.toString();
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

