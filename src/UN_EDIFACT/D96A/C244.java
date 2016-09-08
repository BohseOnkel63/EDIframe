package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C244 extends CompositeElement {
    public E4415 e4415;
    public E1131 e1131;
    public E3055 e3055;
    public E4416 e4416;


    public C244() {
        this(false, null, null, null, null);
    }


    public C244(Boolean Mandatory, String s4415, String s1131, String s3055, String s4416) {
        super("C244", "TEST METHOD", "Specification of the test method employed.");
        this.setMandatory(Mandatory);
        e4415 = new E4415();
        e1131 = new E1131();
        e3055 = new E3055();
        e4416 = new E4416();
        e4415.setContent(s4415);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4416.setContent(s4416);
        addElement(e4415);
        addElement(e1131);
        addElement(e3055);
        addElement(e4416);
    }


}

