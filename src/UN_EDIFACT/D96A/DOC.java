package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DOC extends Segment {

    public C002 eC002;
    public C503 eC503;
    public E3153 e3153;
    public E1220 e1220;
    public E1218 e1218;

    public DOC() {
        this(false);
    }

    public DOC(Boolean Mandatory) {
        super("DOC", "DOCUMENT/MESSAGE DETAILS", "Function: To identify documents, either printed, electronically");
        this.setMandatory(Mandatory);
        eC002 = new C002();
        eC503 = new C503();
        e3153 = new E3153();
        e1220 = new E1220();
        e1218 = new E1218();
        addElement(eC002);
        addElement(eC503);
        addElement(e3153);
        addElement(e1220);
        addElement(e1218);
        eC002.setMandatory(true);
    }

}
