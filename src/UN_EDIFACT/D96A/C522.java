package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C522 extends CompositeElement {
    public E4403 e4403;
    public E4401 e4401;
    public E1131 e1131;
    public E3055 e3055;
    public E4400 e4400;


    public C522() {
        this(false, null, null, null, null, null);
    }


    public C522(Boolean Mandatory, String s4403, String s4401, String s1131, String s3055, String s4400) {
        super("C522", "INSTRUCTION", "To specify an instruction.");
        this.setMandatory(Mandatory);
        e4403 = new E4403();
        e4401 = new E4401();
        e1131 = new E1131();
        e3055 = new E3055();
        e4400 = new E4400();
        e4403.setContent(s4403);
        e4403.setMandatory(true);
        e4401.setContent(s4401);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4400.setContent(s4400);
        addElement(e4403);
        addElement(e4401);
        addElement(e1131);
        addElement(e3055);
        addElement(e4400);
    }


}

