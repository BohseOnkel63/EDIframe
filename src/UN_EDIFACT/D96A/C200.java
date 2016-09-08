package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C200 extends CompositeElement {
    public E8023 e8023;
    public E1131 e1131;
    public E3055 e3055;
    public E8022 e8022;
    public E4237 e4237;
    public E7140 e7140;


    public C200() {
        this(false, null, null, null, null, null, null);
    }


    public C200(Boolean Mandatory, String s8023, String s1131, String s3055, String s8022, String s4237, String s7140) {
        super("C200", "CHARGE", "Identification of a charge by code and/or by name.");
        this.setMandatory(Mandatory);
        e8023 = new E8023();
        e1131 = new E1131();
        e3055 = new E3055();
        e8022 = new E8022();
        e4237 = new E4237();
        e7140 = new E7140();
        e8023.setContent(s8023);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8022.setContent(s8022);
        e4237.setContent(s4237);
        e7140.setContent(s7140);
        addElement(e8023);
        addElement(e1131);
        addElement(e3055);
        addElement(e8022);
        addElement(e4237);
        addElement(e7140);
    }


}

