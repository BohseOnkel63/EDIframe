package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C509 extends CompositeElement {
    public E5125 e5125;
    public E5118 e5118;
    public E5375 e5375;
    public E5387 e5387;
    public E5284 e5284;
    public E6411 e6411;


    public C509() {
        this(false, null, null, null, null, null, null);
    }


    public C509(Boolean Mandatory, String s5125, String s5118, String s5375, String s5387, String s5284, String s6411) {
        super("C509", "PRICE INFORMATION", "Identification of price type, price and related details.");
        this.setMandatory(Mandatory);
        e5125 = new E5125();
        e5118 = new E5118();
        e5375 = new E5375();
        e5387 = new E5387();
        e5284 = new E5284();
        e6411 = new E6411();
        e5125.setContent(s5125);
        e5125.setMandatory(true);
        e5118.setContent(s5118);
        e5375.setContent(s5375);
        e5387.setContent(s5387);
        e5284.setContent(s5284);
        e6411.setContent(s6411);
        addElement(e5125);
        addElement(e5118);
        addElement(e5375);
        addElement(e5387);
        addElement(e5284);
        addElement(e6411);
    }


}

