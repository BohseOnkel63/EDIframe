package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DIM extends Segment {

    public E6145 e6145;
    public C211 eC211;

    public DIM() {
        this(false);
    }

    public DIM(Boolean Mandatory) {
        super("DIM", "DIMENSIONS", "Function: To specify dimensions.");
        this.setMandatory(Mandatory);
        e6145 = new E6145();
        eC211 = new C211();
        addElement(e6145);
        addElement(eC211);
        e6145.setMandatory(true);
        eC211.setMandatory(true);
    }

}
