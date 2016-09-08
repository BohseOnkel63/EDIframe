package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C543 extends CompositeElement {
    public E7431 e7431;
    public E7433 e7433;
    public E1131 e1131;
    public E3055 e3055;
    public E7434 e7434;


    public C543() {
        this(false, null, null, null, null, null);
    }


    public C543(Boolean Mandatory, String s7431, String s7433, String s1131, String s3055, String s7434) {
        super("C543", "AGREEMENT TYPE IDENTIFICATION", "Identification of specific agreement type by code or name.");
        this.setMandatory(Mandatory);
        e7431 = new E7431();
        e7433 = new E7433();
        e1131 = new E1131();
        e3055 = new E3055();
        e7434 = new E7434();
        e7431.setContent(s7431);
        e7431.setMandatory(true);
        e7433.setContent(s7433);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7434.setContent(s7434);
        addElement(e7431);
        addElement(e7433);
        addElement(e1131);
        addElement(e3055);
        addElement(e7434);
    }


}

