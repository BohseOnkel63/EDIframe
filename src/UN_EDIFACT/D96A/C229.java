package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C229 extends CompositeElement {
    public E5237 e5237;
    public E1131 e1131;
    public E3055 e3055;


    public C229() {
        this(false, null, null, null);
    }


    public C229(Boolean Mandatory, String s5237, String s1131, String s3055) {
        super("C229", "CHARGE CATEGORY", "Identification of a category or a zone of charges.");
        this.setMandatory(Mandatory);
        e5237 = new E5237();
        e1131 = new E1131();
        e3055 = new E3055();
        e5237.setContent(s5237);
        e5237.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5237);
        addElement(e1131);
        addElement(e3055);
    }


}

