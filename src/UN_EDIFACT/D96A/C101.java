package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C101 extends CompositeElement {
    public E3483 e3483;
    public E1131 e1131;
    public E3055 e3055;
    public E3482 e3482;


    public C101() {
        this(false, null, null, null, null);
    }


    public C101(Boolean Mandatory, String s3483, String s1131, String s3055, String s3482) {
        super("C101", "RELIGION DETAILS", "To specify the religion of a person.");
        this.setMandatory(Mandatory);
        e3483 = new E3483();
        e1131 = new E1131();
        e3055 = new E3055();
        e3482 = new E3482();
        e3483.setContent(s3483);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3482.setContent(s3482);
        addElement(e3483);
        addElement(e1131);
        addElement(e3055);
        addElement(e3482);
    }


}

