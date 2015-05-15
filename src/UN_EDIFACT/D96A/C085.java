package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C085 {
    private final String Tag = "C085";
    private final String Description = "MARITAL STATUS DETAILS";
    private final String LongDescription = "To specify the marital status of a person.";
    private Boolean Mandatory;


    public E3479 e3479 = new E3479();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3478 e3478 = new E3478();


    public C085() {
    }


    public C085(Boolean Mandatory, String s3479, String s1131, String s3055, String s3478) {
        this.Mandatory = Mandatory;
        e3479.setContent(s3479);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3478.setContent(s3478);
    }


    public void validate() throws ValidityException {
        try {
            e3479.validate();
            e1131.validate();
            e3055.validate();
            e3478.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e3479.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e3478.toString();
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

