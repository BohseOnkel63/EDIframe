package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C512 extends CompositeElement {
    public E6173 e6173;
    public E6174 e6174;


    public C512() {
        this(false, null, null);
    }


    public C512(Boolean Mandatory, String s6173, String s6174) {
        super("C512", "SIZE DETAILS", "Information about the number of observations.");
        this.setMandatory(Mandatory);
        e6173 = new E6173();
        e6174 = new E6174();
        e6173.setContent(s6173);
        e6174.setContent(s6174);
        addElement(e6173);
        addElement(e6174);
    }


}

