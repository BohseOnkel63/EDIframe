package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C955 extends CompositeElement {
    public E9021 e9021;
    public E1131 e1131;
    public E3055 e3055;


    public C955() {
        this(false, null, null, null);
    }


    public C955(Boolean Mandatory, String s9021, String s1131, String s3055) {
        super("C955", "ATTRIBUTE TYPE", "Identification of the type of attribute.");
        this.setMandatory(Mandatory);
        e9021 = new E9021();
        e1131 = new E1131();
        e3055 = new E3055();
        e9021.setContent(s9021);
        e9021.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e9021);
        addElement(e1131);
        addElement(e3055);
    }


}

