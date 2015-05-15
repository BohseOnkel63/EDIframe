package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C205 {
    private final String Tag = "C205";
    private final String Description = "HAZARD CODE";
    private final String LongDescription = "The identification of the dangerous goods in code.";
    private Boolean Mandatory;


    public E8351 e8351 = new E8351();
    public E8078 e8078 = new E8078();
    public E8092 e8092 = new E8092();


    public C205() {
        e8351.setMandatory(true);
    }


    public C205(Boolean Mandatory, String s8351, String s8078, String s8092) {
        this.Mandatory = Mandatory;
        e8351.setContent(s8351);
        e8351.setMandatory(true);
        e8078.setContent(s8078);
        e8092.setContent(s8092);
    }


    public void validate() throws ValidityException {
        try {
            e8351.validate();
            e8078.validate();
            e8092.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8351.toString() + ":" + e8078.toString() + ":" + e8092.toString();
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

