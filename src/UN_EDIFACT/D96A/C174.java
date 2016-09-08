package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C174 extends CompositeElement {
    public E6411 e6411;
    public E6314 e6314;
    public E6162 e6162;
    public E6152 e6152;
    public E6432 e6432;


    public C174() {
        this(false, null, null, null, null, null);
    }


    public C174(Boolean Mandatory, String s6411, String s6314, String s6162, String s6152, String s6432) {
        super("C174", "VALUE/RANGE", "Measurement value and relevant minimum and maximum tolerances in that order.");
        this.setMandatory(Mandatory);
        e6411 = new E6411();
        e6314 = new E6314();
        e6162 = new E6162();
        e6152 = new E6152();
        e6432 = new E6432();
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6314.setContent(s6314);
        e6162.setContent(s6162);
        e6152.setContent(s6152);
        e6432.setContent(s6432);
        addElement(e6411);
        addElement(e6314);
        addElement(e6162);
        addElement(e6152);
        addElement(e6432);
    }


}

