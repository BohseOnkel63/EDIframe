package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C534 extends CompositeElement {
    public E4439 e4439;
    public E4431 e4431;
    public E4461 e4461;
    public E1131 e1131;
    public E3055 e3055;
    public E4435 e4435;


    public C534() {
        this(false, null, null, null, null, null, null);
    }


    public C534(Boolean Mandatory, String s4439, String s4431, String s4461, String s1131, String s3055, String s4435) {
        super("C534", "PAYMENT INSTRUCTION DETAILS", "Indication of method of payment employed or to be employed.");
        this.setMandatory(Mandatory);
        e4439 = new E4439();
        e4431 = new E4431();
        e4461 = new E4461();
        e1131 = new E1131();
        e3055 = new E3055();
        e4435 = new E4435();
        e4439.setContent(s4439);
        e4431.setContent(s4431);
        e4461.setContent(s4461);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4435.setContent(s4435);
        addElement(e4439);
        addElement(e4431);
        addElement(e4461);
        addElement(e1131);
        addElement(e3055);
        addElement(e4435);
    }


}

