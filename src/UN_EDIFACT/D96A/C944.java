package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C944 extends CompositeElement {
    public E7453 e7453;
    public E1131 e1131;
    public E3055 e3055;
    public E7452 e7452;


    public C944() {
        this(false, null, null, null, null);
    }


    public C944(Boolean Mandatory, String s7453, String s1131, String s3055, String s7452) {
        super("C944", "MEMBERSHIP STATUS", "Code and/or description of membership status.");
        this.setMandatory(Mandatory);
        e7453 = new E7453();
        e1131 = new E1131();
        e3055 = new E3055();
        e7452 = new E7452();
        e7453.setContent(s7453);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7452.setContent(s7452);
        addElement(e7453);
        addElement(e1131);
        addElement(e3055);
        addElement(e7452);
    }


}

