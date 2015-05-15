package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C174 {
    private final String Tag = "C174";
    private final String Description = "VALUE/RANGE";
    private final String LongDescription = "Measurement value and relevant minimum and maximum tolerances in that order.";
    private Boolean Mandatory;


    public E6411 e6411 = new E6411();
    public E6314 e6314 = new E6314();
    public E6162 e6162 = new E6162();
    public E6152 e6152 = new E6152();
    public E6432 e6432 = new E6432();


    public C174() {
        e6411.setMandatory(true);
    }


    public C174(Boolean Mandatory, String s6411, String s6314, String s6162, String s6152, String s6432) {
        this.Mandatory = Mandatory;
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6314.setContent(s6314);
        e6162.setContent(s6162);
        e6152.setContent(s6152);
        e6432.setContent(s6432);
    }


    public void validate() throws ValidityException {
        try {
            e6411.validate();
            e6314.validate();
            e6162.validate();
            e6152.validate();
            e6432.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e6411.toString() + ":" + e6314.toString() + ":" + e6162.toString() + ":" + e6152.toString() + ":" + e6432.toString();
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

