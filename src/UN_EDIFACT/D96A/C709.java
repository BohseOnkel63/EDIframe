package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C709 extends CompositeElement {
    public E1475 e1475;
    public E1056 e1056;
    public E1058 e1058;
    public E1476 e1476;
    public E1523 e1523;
    public E1060 e1060;


    public C709() {
        this(false, null, null, null, null, null, null);
    }


    public C709(Boolean Mandatory, String s1475, String s1056, String s1058, String s1476, String s1523, String s1060) {
        super("C709", "MESSAGE IDENTIFIER", "Identification of the message.");
        this.setMandatory(Mandatory);
        e1475 = new E1475();
        e1056 = new E1056();
        e1058 = new E1058();
        e1476 = new E1476();
        e1523 = new E1523();
        e1060 = new E1060();
        e1475.setContent(s1475);
        e1475.setMandatory(true);
        e1056.setContent(s1056);
        e1056.setMandatory(true);
        e1058.setContent(s1058);
        e1058.setMandatory(true);
        e1476.setContent(s1476);
        e1476.setMandatory(true);
        e1523.setContent(s1523);
        e1060.setContent(s1060);
        addElement(e1475);
        addElement(e1056);
        addElement(e1058);
        addElement(e1476);
        addElement(e1523);
        addElement(e1060);
    }


}

