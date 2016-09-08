package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C528 extends CompositeElement {
    public E7357 e7357;
    public E1131 e1131;
    public E3055 e3055;


    public C528() {
        this(false, null, null, null);
    }


    public C528(Boolean Mandatory, String s7357, String s1131, String s3055) {
        super("C528", "COMMODITY/RATE DETAIL", "Identification of commodity/rates.");
        this.setMandatory(Mandatory);
        e7357 = new E7357();
        e1131 = new E1131();
        e3055 = new E3055();
        e7357.setContent(s7357);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e7357);
        addElement(e1131);
        addElement(e3055);
    }


}

