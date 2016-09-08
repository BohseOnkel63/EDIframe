package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C107 extends CompositeElement {
    public E4441 e4441;
    public E1131 e1131;
    public E3055 e3055;


    public C107() {
        this(false, null, null, null);
    }


    public C107(Boolean Mandatory, String s4441, String s1131, String s3055) {
        super("C107", "TEXT REFERENCE", "Coded reference to a standard text and its source.");
        this.setMandatory(Mandatory);
        e4441 = new E4441();
        e1131 = new E1131();
        e3055 = new E3055();
        e4441.setContent(s4441);
        e4441.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e4441);
        addElement(e1131);
        addElement(e3055);
    }


}

