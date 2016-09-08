package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C526 extends CompositeElement {
    public E6071 e6071;
    public E6072 e6072;
    public E6411 e6411;


    public C526() {
        this(false, null, null, null);
    }


    public C526(Boolean Mandatory, String s6071, String s6072, String s6411) {
        super("C526", "FREQUENCY DETAILS", "Number of samples collected per specified unit of measure.");
        this.setMandatory(Mandatory);
        e6071 = new E6071();
        e6072 = new E6072();
        e6411 = new E6411();
        e6071.setContent(s6071);
        e6071.setMandatory(true);
        e6072.setContent(s6072);
        e6411.setContent(s6411);
        addElement(e6071);
        addElement(e6072);
        addElement(e6411);
    }


}

