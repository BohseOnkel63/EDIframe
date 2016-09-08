package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C507 extends CompositeElement {
    public E2005 e2005;
    public E2380 e2380;
    public E2379 e2379;


    public C507() {
        this(false, null, null, null);
    }


    public C507(Boolean Mandatory, String s2005, String s2380, String s2379) {
        super("C507", "DATE/TIME/PERIOD", "Date and/or time, or period relevant to the specified date/time/period type.");
        this.setMandatory(Mandatory);
        e2005 = new E2005();
        e2380 = new E2380();
        e2379 = new E2379();
        e2005.setContent(s2005);
        e2005.setMandatory(true);
        e2380.setContent(s2380);
        e2379.setContent(s2379);
        addElement(e2005);
        addElement(e2380);
        addElement(e2379);
    }


}

