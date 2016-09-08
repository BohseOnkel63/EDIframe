package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C524 extends CompositeElement {
    public E4079 e4079;
    public E1131 e1131;
    public E3055 e3055;
    public E4078 e4078;


    public C524() {
        this(false, null, null, null, null);
    }


    public C524(Boolean Mandatory, String s4079, String s1131, String s3055, String s4078) {
        super("C524", "HANDLING INSTRUCTIONS", "Instruction for the handling of goods, products or articles in shipment, storage etc.");
        this.setMandatory(Mandatory);
        e4079 = new E4079();
        e1131 = new E1131();
        e3055 = new E3055();
        e4078 = new E4078();
        e4079.setContent(s4079);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4078.setContent(s4078);
        addElement(e4079);
        addElement(e1131);
        addElement(e3055);
        addElement(e4078);
    }


}

