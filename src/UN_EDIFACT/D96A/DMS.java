package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DMS extends Segment {

    public E1004 e1004;
    public E1001 e1001;
    public E7240 e7240;

    public DMS() {
        this(false);
    }

    public DMS(Boolean Mandatory) {
        super("DMS", "DOCUMENT/MESSAGE SUMMARY", "Function: To specify summary information relating to the");
        this.setMandatory(Mandatory);
        e1004 = new E1004();
        e1001 = new E1001();
        e7240 = new E7240();
        addElement(e1004);
        addElement(e1001);
        addElement(e7240);
    }

}
