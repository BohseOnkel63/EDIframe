package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C234 extends CompositeElement {
    public E7124 e7124;
    public E7088 e7088;


    public C234() {
        this(false, null, null);
    }


    public C234(Boolean Mandatory, String s7124, String s7088) {
        super("C234", "UNDG INFORMATION", "Information on United Nations Dangerous Goods classification.");
        this.setMandatory(Mandatory);
        e7124 = new E7124();
        e7088 = new E7088();
        e7124.setContent(s7124);
        e7088.setContent(s7088);
        addElement(e7124);
        addElement(e7088);
    }


}

