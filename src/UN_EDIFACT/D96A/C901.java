package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C901 extends CompositeElement {
    public E9321 e9321;
    public E1131 e1131;
    public E3055 e3055;


    public C901() {
        this(false, null, null, null);
    }


    public C901(Boolean Mandatory, String s9321, String s1131, String s3055) {
        super("C901", "APPLICATION ERROR DETAIL", "Code assigned by the recipient of a message to indicate a data validation error condition.");
        this.setMandatory(Mandatory);
        e9321 = new E9321();
        e1131 = new E1131();
        e3055 = new E3055();
        e9321.setContent(s9321);
        e9321.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e9321);
        addElement(e1131);
        addElement(e3055);
    }


}

