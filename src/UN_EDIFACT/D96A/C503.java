package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C503 extends CompositeElement {
    public E1004 e1004;
    public E1373 e1373;
    public E1366 e1366;
    public E3453 e3453;


    public C503() {
        this(false, null, null, null, null);
    }


    public C503(Boolean Mandatory, String s1004, String s1373, String s1366, String s3453) {
        super("C503", "DOCUMENT/MESSAGE DETAILS", "Identification of document/message by number, status, source and/or language.");
        this.setMandatory(Mandatory);
        e1004 = new E1004();
        e1373 = new E1373();
        e1366 = new E1366();
        e3453 = new E3453();
        e1004.setContent(s1004);
        e1373.setContent(s1373);
        e1366.setContent(s1366);
        e3453.setContent(s3453);
        addElement(e1004);
        addElement(e1373);
        addElement(e1366);
        addElement(e3453);
    }


}

