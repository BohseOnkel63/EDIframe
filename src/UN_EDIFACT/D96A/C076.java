package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C076 extends CompositeElement {
    public E3148 e3148;
    public E3155 e3155;


    public C076() {
        this(false, null, null);
    }


    public C076(Boolean Mandatory, String s3148, String s3155) {
        super("C076", "COMMUNICATION CONTACT", "Communication number of a department or employee in a specified channel.");
        this.setMandatory(Mandatory);
        e3148 = new E3148();
        e3155 = new E3155();
        e3148.setContent(s3148);
        e3148.setMandatory(true);
        e3155.setContent(s3155);
        e3155.setMandatory(true);
        addElement(e3148);
        addElement(e3155);
    }


}

