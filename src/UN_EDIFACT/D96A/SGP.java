package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SGP extends Segment {

    public C237 eC237;
    public E7224 e7224;

    public SGP() {
        this(false);
    }

    public SGP(Boolean Mandatory) {
        super("SGP", "SPLIT GOODS PLACEMENT", "Function: To specify the placement of goods in relation to");
        this.setMandatory(Mandatory);
        eC237 = new C237();
        e7224 = new E7224();
        addElement(eC237);
        addElement(e7224);
        eC237.setMandatory(true);
    }

}
