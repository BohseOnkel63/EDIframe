package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C110 extends CompositeElement {
    public E4277 e4277;
    public E1131 e1131;
    public E3055 e3055;
    public E4276 e4276_1;
    public E4276 e4276_2;


    public C110() {
        this(false, null, null, null, null, null);
    }


    public C110(Boolean Mandatory, String s4277, String s1131, String s3055, String s4276_1, String s4276_2) {
        super("C110", "PAYMENT TERMS", "Terms of payment code from a specified source.");
        this.setMandatory(Mandatory);
        e4277 = new E4277();
        e1131 = new E1131();
        e3055 = new E3055();
        e4276_1 = new E4276();
        e4276_2 = new E4276();
        e4277.setContent(s4277);
        e4277.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4276_1.setContent(s4276_1);
        e4276_2.setContent(s4276_2);
        addElement(e4277);
        addElement(e1131);
        addElement(e3055);
        addElement(e4276_1);
        addElement(e4276_2);
    }


}

