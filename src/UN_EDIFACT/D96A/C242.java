package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C242 extends CompositeElement {
    public E7187 e7187;
    public E1131 e1131;
    public E3055 e3055;
    public E7186 e7186_1;
    public E7186 e7186_2;


    public C242() {
        this(false, null, null, null, null, null);
    }


    public C242(Boolean Mandatory, String s7187, String s1131, String s3055, String s7186_1, String s7186_2) {
        super("C242", "PROCESS TYPE AND DESCRIPTION", "Identification of process type and description.");
        this.setMandatory(Mandatory);
        e7187 = new E7187();
        e1131 = new E1131();
        e3055 = new E3055();
        e7186_1 = new E7186();
        e7186_2 = new E7186();
        e7187.setContent(s7187);
        e7187.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7186_1.setContent(s7186_1);
        e7186_2.setContent(s7186_2);
        addElement(e7187);
        addElement(e1131);
        addElement(e3055);
        addElement(e7186_1);
        addElement(e7186_2);
    }


}

