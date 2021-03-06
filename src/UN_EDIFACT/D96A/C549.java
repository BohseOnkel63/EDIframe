package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C549 extends CompositeElement {
    public E5007 e5007;
    public E1131 e1131;
    public E3055 e3055;


    public C549() {
        this(false, null, null, null);
    }


    public C549(Boolean Mandatory, String s5007, String s1131, String s3055) {
        super("C549", "MONETARY FUNCTION", "To identify the function of a related monetary amount.");
        this.setMandatory(Mandatory);
        e5007 = new E5007();
        e1131 = new E1131();
        e3055 = new E3055();
        e5007.setContent(s5007);
        e5007.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5007);
        addElement(e1131);
        addElement(e3055);
    }


}

