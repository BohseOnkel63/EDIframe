package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C827 extends CompositeElement {
    public E7511 e7511;
    public E1131 e1131;
    public E3055 e3055;


    public C827() {
        this(false, null, null, null);
    }


    public C827(Boolean Mandatory, String s7511, String s1131, String s3055) {
        super("C827", "TYPE OF MARKING", "Specification of the type of marking that reflects the method that was used and the conventions adhered to for marking (e.g. of packages).");
        this.setMandatory(Mandatory);
        e7511 = new E7511();
        e1131 = new E1131();
        e3055 = new E3055();
        e7511.setContent(s7511);
        e7511.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e7511);
        addElement(e1131);
        addElement(e3055);
    }


}

