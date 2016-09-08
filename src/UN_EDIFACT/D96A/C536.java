package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C536 extends CompositeElement {
    public E4065 e4065;
    public E1131 e1131;
    public E3055 e3055;


    public C536() {
        this(false, null, null, null);
    }


    public C536(Boolean Mandatory, String s4065, String s1131, String s3055) {
        super("C536", "CONTRACT AND CARRIAGE CONDITION", "To identify a contract and carriage condition.");
        this.setMandatory(Mandatory);
        e4065 = new E4065();
        e1131 = new E1131();
        e3055 = new E3055();
        e4065.setContent(s4065);
        e4065.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e4065);
        addElement(e1131);
        addElement(e3055);
    }


}

