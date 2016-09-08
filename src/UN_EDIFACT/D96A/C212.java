package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C212 extends CompositeElement {
    public E7140 e7140;
    public E7143 e7143;
    public E1131 e1131;
    public E3055 e3055;


    public C212() {
        this(false, null, null, null, null);
    }


    public C212(Boolean Mandatory, String s7140, String s7143, String s1131, String s3055) {
        super("C212", "ITEM NUMBER IDENTIFICATION", "Goods identification for a specified source.");
        this.setMandatory(Mandatory);
        e7140 = new E7140();
        e7143 = new E7143();
        e1131 = new E1131();
        e3055 = new E3055();
        e7140.setContent(s7140);
        e7143.setContent(s7143);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e7140);
        addElement(e7143);
        addElement(e1131);
        addElement(e3055);
    }


}

