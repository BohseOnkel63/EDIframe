package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C545 extends CompositeElement {
    public E5013 e5013;
    public E5027 e5027;
    public E1131 e1131;
    public E3055 e3055;


    public C545() {
        this(false, null, null, null, null);
    }


    public C545(Boolean Mandatory, String s5013, String s5027, String s1131, String s3055) {
        super("C545", "INDEX IDENTIFICATION", "To identify an index.");
        this.setMandatory(Mandatory);
        e5013 = new E5013();
        e5027 = new E5027();
        e1131 = new E1131();
        e3055 = new E3055();
        e5013.setContent(s5013);
        e5013.setMandatory(true);
        e5027.setContent(s5027);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5013);
        addElement(e5027);
        addElement(e1131);
        addElement(e3055);
    }


}

