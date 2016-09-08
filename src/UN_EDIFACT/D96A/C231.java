package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C231 extends CompositeElement {
    public E4215 e4215;
    public E1131 e1131;
    public E3055 e3055;


    public C231() {
        this(false, null, null, null);
    }


    public C231(Boolean Mandatory, String s4215, String s1131, String s3055) {
        super("C231", "METHOD OF PAYMENT", "Code identifying the method of payment.");
        this.setMandatory(Mandatory);
        e4215 = new E4215();
        e1131 = new E1131();
        e3055 = new E3055();
        e4215.setContent(s4215);
        e4215.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e4215);
        addElement(e1131);
        addElement(e3055);
    }


}

