package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C002 extends CompositeElement {
    public E1001 e1001;
    public E1131 e1131;
    public E3055 e3055;
    public E1000 e1000;


    public C002() {
        this(false, null, null, null, null);
    }


    public C002(Boolean Mandatory, String s1001, String s1131, String s3055, String s1000) {
        super("C002", "DOCUMENT/MESSAGE NAME", "Identification of a type of document/message by code or name. Code preferred.");
        this.setMandatory(Mandatory);
        e1001 = new E1001();
        e1131 = new E1131();
        e3055 = new E3055();
        e1000 = new E1000();
        e1001.setContent(s1001);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1000.setContent(s1000);
        addElement(e1001);
        addElement(e1131);
        addElement(e3055);
        addElement(e1000);
    }


}

