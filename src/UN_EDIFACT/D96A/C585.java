package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C585 extends CompositeElement {
    public E4037 e4037;
    public E1131 e1131;
    public E3055 e3055;
    public E4036 e4036;


    public C585() {
        this(false, null, null, null, null);
    }


    public C585(Boolean Mandatory, String s4037, String s1131, String s3055, String s4036) {
        super("C585", "PRIORITY DETAILS", "To indicate a priority.");
        this.setMandatory(Mandatory);
        e4037 = new E4037();
        e1131 = new E1131();
        e3055 = new E3055();
        e4036 = new E4036();
        e4037.setContent(s4037);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4036.setContent(s4036);
        addElement(e4037);
        addElement(e1131);
        addElement(e3055);
        addElement(e4036);
    }


}

