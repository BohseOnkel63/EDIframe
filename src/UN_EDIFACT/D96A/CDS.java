package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CDS extends Segment {

    public C702 eC702;
    public E1507 e1507;
    public E4513 e4513;

    public CDS() {
        this(false);
    }

    public CDS(Boolean Mandatory) {
        super("CDS", "CODE SET IDENTIFICATION", "Function: To identify a code set and to give its class and");
        this.setMandatory(Mandatory);
        eC702 = new C702();
        e1507 = new E1507();
        e4513 = new E4513();
        addElement(eC702);
        addElement(e1507);
        addElement(e4513);
        eC702.setMandatory(true);
    }

}
