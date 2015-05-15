package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C222 {
    private final String Tag = "C222";
    private final String Description = "TRANSPORT IDENTIFICATION";
    private final String LongDescription = "Code and/or name identifying the means of transport.";
    private Boolean Mandatory;


    public E8213 e8213 = new E8213();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E8212 e8212 = new E8212();
    public E8453 e8453 = new E8453();


    public C222() {
    }


    public C222(Boolean Mandatory, String s8213, String s1131, String s3055, String s8212, String s8453) {
        this.Mandatory = Mandatory;
        e8213.setContent(s8213);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8212.setContent(s8212);
        e8453.setContent(s8453);
    }


    public void validate() throws ValidityException {
        try {
            e8213.validate();
            e1131.validate();
            e3055.validate();
            e8212.validate();
            e8453.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e8213.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e8212.toString() + ":" + e8453.toString();
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

