package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C220 {
    private final String Tag = "C220";
    private final String Description = "MODE OF TRANSPORT";
    private final String LongDescription = "Method of transport code or name. Code preferred.";
    private Boolean Mandatory;


    public E8067 e8067 = new E8067();
    public E8066 e8066 = new E8066();


    public C220() {
    }


    public C220(Boolean Mandatory, String s8067, String s8066) {
        this.Mandatory = Mandatory;
        e8067.setContent(s8067);
        e8066.setContent(s8066);
    }


    public void validate() throws ValidityException {
        try {
            e8067.validate();
            e8066.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8067.toString() + ":" + e8066.toString();
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

