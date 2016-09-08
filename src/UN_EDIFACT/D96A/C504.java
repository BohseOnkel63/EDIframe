package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C504 extends CompositeElement {
    public E6347 e6347;
    public E6345 e6345;
    public E6343 e6343;
    public E6348 e6348;


    public C504() {
        this(false, null, null, null, null);
    }


    public C504(Boolean Mandatory, String s6347, String s6345, String s6343, String s6348) {
        super("C504", "CURRENCY DETAILS", "The usage to which a currency relates.");
        this.setMandatory(Mandatory);
        e6347 = new E6347();
        e6345 = new E6345();
        e6343 = new E6343();
        e6348 = new E6348();
        e6347.setContent(s6347);
        e6347.setMandatory(true);
        e6345.setContent(s6345);
        e6343.setContent(s6343);
        e6348.setContent(s6348);
        addElement(e6347);
        addElement(e6345);
        addElement(e6343);
        addElement(e6348);
    }


}

