package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C186 extends CompositeElement {
    public E6063 e6063;
    public E6060 e6060;
    public E6411 e6411;


    public C186() {
        this(false, null, null, null);
    }


    public C186(Boolean Mandatory, String s6063, String s6060, String s6411) {
        super("C186", "QUANTITY DETAILS", "Quantity information in a transaction, qualified when relevant.");
        this.setMandatory(Mandatory);
        e6063 = new E6063();
        e6060 = new E6060();
        e6411 = new E6411();
        e6063.setContent(s6063);
        e6063.setMandatory(true);
        e6060.setContent(s6060);
        e6060.setMandatory(true);
        e6411.setContent(s6411);
        addElement(e6063);
        addElement(e6060);
        addElement(e6411);
    }


}

