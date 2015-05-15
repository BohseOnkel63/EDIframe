package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C237 {
    private final String Tag = "C237";
    private final String Description = "EQUIPMENT IDENTIFICATION";
    private final String LongDescription = "Marks (letters and/or numbers) identifying equipment used for transport such as a container.";
    private Boolean Mandatory;


    public E8260 e8260 = new E8260();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3207 e3207 = new E3207();


    public C237() {
    }


    public C237(Boolean Mandatory, String s8260, String s1131, String s3055, String s3207) {
        this.Mandatory = Mandatory;
        e8260.setContent(s8260);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3207.setContent(s3207);
    }


    public void validate() throws ValidityException {
        try {
            e8260.validate();
            e1131.validate();
            e3055.validate();
            e3207.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8260.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3207.toString();
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

