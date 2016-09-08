package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CNT extends Segment {

    public C270 eC270;

    public CNT() {
        this(false);
    }

    public CNT(Boolean Mandatory) {
        super("CNT", "CONTROL TOTAL", "Function: To provide control total.");
        this.setMandatory(Mandatory);
        eC270 = new C270();
        addElement(eC270);
        eC270.setMandatory(true);
    }

}
