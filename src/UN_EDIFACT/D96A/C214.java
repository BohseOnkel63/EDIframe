package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C214 extends CompositeElement {
    public E7161 e7161;
    public E1131 e1131;
    public E3055 e3055;
    public E7160 e7160_1;
    public E7160 e7160_2;


    public C214() {
        this(false, null, null, null, null, null);
    }


    public C214(Boolean Mandatory, String s7161, String s1131, String s3055, String s7160_1, String s7160_2) {
        super("C214", "SPECIAL SERVICES IDENTIFICATION", "Identification of a special service by a code from a specified source or by description.");
        this.setMandatory(Mandatory);
        e7161 = new E7161();
        e1131 = new E1131();
        e3055 = new E3055();
        e7160_1 = new E7160();
        e7160_2 = new E7160();
        e7161.setContent(s7161);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7160_1.setContent(s7160_1);
        e7160_2.setContent(s7160_2);
        addElement(e7161);
        addElement(e1131);
        addElement(e3055);
        addElement(e7160_1);
        addElement(e7160_2);
    }


}

