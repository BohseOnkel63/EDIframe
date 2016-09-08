package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C515 extends CompositeElement {
    public E4425 e4425;
    public E1131 e1131;
    public E3055 e3055;
    public E4424 e4424;


    public C515() {
        this(false, null, null, null, null);
    }


    public C515(Boolean Mandatory, String s4425, String s1131, String s3055, String s4424) {
        super("C515", "TEST REASON", "To identify the reason for the test as specified.");
        this.setMandatory(Mandatory);
        e4425 = new E4425();
        e1131 = new E1131();
        e3055 = new E3055();
        e4424 = new E4424();
        e4425.setContent(s4425);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4424.setContent(s4424);
        addElement(e4425);
        addElement(e1131);
        addElement(e3055);
        addElement(e4424);
    }


}

