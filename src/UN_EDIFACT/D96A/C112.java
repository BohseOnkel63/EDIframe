package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C112 extends CompositeElement {
    public E2475 e2475;
    public E2009 e2009;
    public E2151 e2151;
    public E2152 e2152;


    public C112() {
        this(false, null, null, null, null);
    }


    public C112(Boolean Mandatory, String s2475, String s2009, String s2151, String s2152) {
        super("C112", "TERMS/TIME INFORMATION", "Time details in payment terms.");
        this.setMandatory(Mandatory);
        e2475 = new E2475();
        e2009 = new E2009();
        e2151 = new E2151();
        e2152 = new E2152();
        e2475.setContent(s2475);
        e2475.setMandatory(true);
        e2009.setContent(s2009);
        e2151.setContent(s2151);
        e2152.setContent(s2152);
        addElement(e2475);
        addElement(e2009);
        addElement(e2151);
        addElement(e2152);
    }


}

