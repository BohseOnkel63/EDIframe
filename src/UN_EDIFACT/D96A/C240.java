package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C240 extends CompositeElement {
    public E7037 e7037;
    public E1131 e1131;
    public E3055 e3055;
    public E7036 e7036_1;
    public E7036 e7036_2;


    public C240() {
        this(false, null, null, null, null, null);
    }


    public C240(Boolean Mandatory, String s7037, String s1131, String s3055, String s7036_1, String s7036_2) {
        super("C240", "PRODUCT CHARACTERISTIC", "Specific product characteristic data.");
        this.setMandatory(Mandatory);
        e7037 = new E7037();
        e1131 = new E1131();
        e3055 = new E3055();
        e7036_1 = new E7036();
        e7036_2 = new E7036();
        e7037.setContent(s7037);
        e7037.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7036_1.setContent(s7036_1);
        e7036_2.setContent(s7036_2);
        addElement(e7037);
        addElement(e1131);
        addElement(e3055);
        addElement(e7036_1);
        addElement(e7036_2);
    }


}

