package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C280 extends CompositeElement {
    public E6411 e6411;
    public E6162 e6162;
    public E6152 e6152;


    public C280() {
        this(false, null, null, null);
    }


    public C280(Boolean Mandatory, String s6411, String s6162, String s6152) {
        super("C280", "RANGE", "Range minimum and maximum limits.");
        this.setMandatory(Mandatory);
        e6411 = new E6411();
        e6162 = new E6162();
        e6152 = new E6152();
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6162.setContent(s6162);
        e6152.setContent(s6152);
        addElement(e6411);
        addElement(e6162);
        addElement(e6152);
    }


}

