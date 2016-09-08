package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C564 extends CompositeElement {
    public E7007 e7007;
    public E1131 e1131;
    public E3055 e3055;
    public E7006 e7006;


    public C564() {
        this(false, null, null, null, null);
    }


    public C564(Boolean Mandatory, String s7007, String s1131, String s3055, String s7006) {
        super("C564", "PHYSICAL OR LOGICAL STATE INFORMATION", "To give information in coded or clear text form on the physical or logical state.");
        this.setMandatory(Mandatory);
        e7007 = new E7007();
        e1131 = new E1131();
        e3055 = new E3055();
        e7006 = new E7006();
        e7007.setContent(s7007);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7006.setContent(s7006);
        addElement(e7007);
        addElement(e1131);
        addElement(e3055);
        addElement(e7006);
    }


}

