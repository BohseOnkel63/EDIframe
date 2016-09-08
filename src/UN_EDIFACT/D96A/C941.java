package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C941 extends CompositeElement {
    public E9143 e9143;
    public E1131 e1131;
    public E3055 e3055;
    public E9142 e9142;


    public C941() {
        this(false, null, null, null, null);
    }


    public C941(Boolean Mandatory, String s9143, String s1131, String s3055, String s9142) {
        super("C941", "RELATIONSHIP", "Identification and/or description of a relationship.");
        this.setMandatory(Mandatory);
        e9143 = new E9143();
        e1131 = new E1131();
        e3055 = new E3055();
        e9142 = new E9142();
        e9143.setContent(s9143);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9142.setContent(s9142);
        addElement(e9143);
        addElement(e1131);
        addElement(e3055);
        addElement(e9142);
    }


}

