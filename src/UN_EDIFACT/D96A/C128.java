package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C128 extends CompositeElement {
    public E5419 e5419;
    public E5420 e5420;
    public E5284 e5284;
    public E6411 e6411;


    public C128() {
        this(false, null, null, null, null);
    }


    public C128(Boolean Mandatory, String s5419, String s5420, String s5284, String s6411) {
        super("C128", "RATE DETAILS", "Rate per unit and rate basis.");
        this.setMandatory(Mandatory);
        e5419 = new E5419();
        e5420 = new E5420();
        e5284 = new E5284();
        e6411 = new E6411();
        e5419.setContent(s5419);
        e5419.setMandatory(true);
        e5420.setContent(s5420);
        e5420.setMandatory(true);
        e5284.setContent(s5284);
        e6411.setContent(s6411);
        addElement(e5419);
        addElement(e5420);
        addElement(e5284);
        addElement(e6411);
    }


}

