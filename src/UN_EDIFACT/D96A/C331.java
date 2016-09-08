package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C331 extends CompositeElement {
    public E4495 e4495;
    public E1131 e1131;
    public E3055 e3055;
    public E4494 e4494_1;
    public E4494 e4494_2;


    public C331() {
        this(false, null, null, null, null, null);
    }


    public C331(Boolean Mandatory, String s4495, String s1131, String s3055, String s4494_1, String s4494_2) {
        super("C331", "INSURANCE COVER DETAILS", "To provide the insurance cover details.");
        this.setMandatory(Mandatory);
        e4495 = new E4495();
        e1131 = new E1131();
        e3055 = new E3055();
        e4494_1 = new E4494();
        e4494_2 = new E4494();
        e4495.setContent(s4495);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4494_1.setContent(s4494_1);
        e4494_2.setContent(s4494_2);
        addElement(e4495);
        addElement(e1131);
        addElement(e3055);
        addElement(e4494_1);
        addElement(e4494_2);
    }


}

