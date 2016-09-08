package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class RNG extends Segment {

    public E6167 e6167;
    public C280 eC280;

    public RNG() {
        this(false);
    }

    public RNG(Boolean Mandatory) {
        super("RNG", "RANGE DETAILS", "Function: To identify a range.");
        this.setMandatory(Mandatory);
        e6167 = new E6167();
        eC280 = new C280();
        addElement(e6167);
        addElement(eC280);
        e6167.setMandatory(true);
    }

}
