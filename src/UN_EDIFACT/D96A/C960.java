package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C960 extends CompositeElement {
    public E4295 e4295;
    public E1131 e1131;
    public E3055 e3055;
    public E4294 e4294;


    public C960() {
        this(false, null, null, null, null);
    }


    public C960(Boolean Mandatory, String s4295, String s1131, String s3055, String s4294) {
        super("C960", "REASON FOR CHANGE", "Code and/or description of the reason for a change.");
        this.setMandatory(Mandatory);
        e4295 = new E4295();
        e1131 = new E1131();
        e3055 = new E3055();
        e4294 = new E4294();
        e4295.setContent(s4295);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4294.setContent(s4294);
        addElement(e4295);
        addElement(e1131);
        addElement(e3055);
        addElement(e4294);
    }


}

