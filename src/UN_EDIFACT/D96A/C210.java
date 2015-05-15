package UN_EDIFACT.D96A;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;


public class C210 {
    private final String Tag = "C210";
    private final String Description = "MARKS & LABELS";
    private final String LongDescription = "Shipping marks on packages in free text; one to ten lines.";
    private Boolean Mandatory;


    public E7102 e7102_1 = new E7102();
    public E7102 e7102_2 = new E7102();
    public E7102 e7102_3 = new E7102();
    public E7102 e7102_4 = new E7102();
    public E7102 e7102_5 = new E7102();
    public E7102 e7102_6 = new E7102();
    public E7102 e7102_7 = new E7102();
    public E7102 e7102_8 = new E7102();
    public E7102 e7102_9 = new E7102();
    public E7102 e7102_10 = new E7102();


    public C210() {
        e7102_1.setMandatory(true);
    }


    public C210(Boolean Mandatory, String s7102_1, String s7102_2, String s7102_3, String s7102_4, String s7102_5, String s7102_6, String s7102_7, String s7102_8, String s7102_9, String s7102_10) {
        this.Mandatory = Mandatory;
        e7102_1.setContent(s7102_1);
        e7102_1.setMandatory(true);
        e7102_2.setContent(s7102_2);
        e7102_3.setContent(s7102_3);
        e7102_4.setContent(s7102_4);
        e7102_5.setContent(s7102_5);
        e7102_6.setContent(s7102_6);
        e7102_7.setContent(s7102_7);
        e7102_8.setContent(s7102_8);
        e7102_9.setContent(s7102_9);
        e7102_10.setContent(s7102_10);
    }


    public void validate() throws ValidityException {
        try {
            e7102_1.validate();
            e7102_2.validate();
            e7102_3.validate();
            e7102_4.validate();
            e7102_5.validate();
            e7102_6.validate();
            e7102_7.validate();
            e7102_8.validate();
            e7102_9.validate();
            e7102_10.validate();
        } catch(ValidityException ex) {
            throw new ValidityException(this.Tag + "." + ex.getMessage());
        }
    }
    @Override
    public String toString() {
        String output;

        output = e7102_1.toString() + ":" + e7102_2.toString() + ":" + e7102_3.toString() + ":" + e7102_4.toString() + ":" + e7102_5.toString() + ":" + e7102_6.toString() + ":" + e7102_7.toString() + ":" + e7102_8.toString() + ":" + e7102_9.toString() + ":" + e7102_10.toString();
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

