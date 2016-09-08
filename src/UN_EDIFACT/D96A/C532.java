package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C532 extends CompositeElement {
    public E8395 e8395;
    public E8393 e8393;


    public C532() {
        this(false, null, null);
    }


    public C532(Boolean Mandatory, String s8395, String s8393) {
        super("C532", "RETURNABLE PACKAGE DETAILS", "Indication of responsibility for payment and load contents of returnable packages.");
        this.setMandatory(Mandatory);
        e8395 = new E8395();
        e8393 = new E8393();
        e8395.setContent(s8395);
        e8393.setContent(s8393);
        addElement(e8395);
        addElement(e8393);
    }


}

