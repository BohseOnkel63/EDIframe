package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C554 extends CompositeElement {
    public E5243 e5243;
    public E1131 e1131;
    public E3055 e3055;


    public C554() {
        this(false, null, null, null);
    }


    public C554(Boolean Mandatory, String s5243, String s1131, String s3055) {
        super("C554", "RATE/TARIFF CLASS DETAIL", "Identification of the applicable rate/tariff class.");
        this.setMandatory(Mandatory);
        e5243 = new E5243();
        e1131 = new E1131();
        e3055 = new E3055();
        e5243.setContent(s5243);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5243);
        addElement(e1131);
        addElement(e3055);
    }


}

