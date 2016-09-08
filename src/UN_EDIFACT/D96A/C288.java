package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C288 extends CompositeElement {
    public E5389 e5389;
    public E1131 e1131;
    public E3055 e3055;
    public E5388 e5388;


    public C288() {
        this(false, null, null, null, null);
    }


    public C288(Boolean Mandatory, String s5389, String s1131, String s3055, String s5388) {
        super("C288", "PRODUCT GROUP", "To give product group information.");
        this.setMandatory(Mandatory);
        e5389 = new E5389();
        e1131 = new E1131();
        e3055 = new E3055();
        e5388 = new E5388();
        e5389.setContent(s5389);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5388.setContent(s5388);
        addElement(e5389);
        addElement(e1131);
        addElement(e3055);
        addElement(e5388);
    }


}

