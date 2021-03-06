package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C782 extends CompositeElement {
    public E1520 e1520;
    public E7405 e7405;


    public C782() {
        this(false, null, null);
    }


    public C782(Boolean Mandatory, String s1520, String s7405) {
        super("C782", "DATA SET IDENTIFICATION", "The identification of a data set.");
        this.setMandatory(Mandatory);
        e1520 = new E1520();
        e7405 = new E7405();
        e1520.setContent(s1520);
        e1520.setMandatory(true);
        e7405.setContent(s7405);
        addElement(e1520);
        addElement(e7405);
    }


}

