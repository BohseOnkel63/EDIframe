package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C099 extends CompositeElement {
    public E1516 e1516;
    public E1056 e1056;
    public E1503 e1503;
    public E1502 e1502;


    public C099() {
        this(false, null, null, null, null);
    }


    public C099(Boolean Mandatory, String s1516, String s1056, String s1503, String s1502) {
        super("C099", "FILE DETAILS", "To define details relevant to a file.");
        this.setMandatory(Mandatory);
        e1516 = new E1516();
        e1056 = new E1056();
        e1503 = new E1503();
        e1502 = new E1502();
        e1516.setContent(s1516);
        e1516.setMandatory(true);
        e1056.setContent(s1056);
        e1503.setContent(s1503);
        e1502.setContent(s1502);
        addElement(e1516);
        addElement(e1056);
        addElement(e1503);
        addElement(e1502);
    }


}

