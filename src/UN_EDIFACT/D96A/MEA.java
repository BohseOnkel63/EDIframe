package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class MEA extends Segment {

    public E6311 e6311;
    public C502 eC502;
    public C174 eC174;
    public E7383 e7383;

    public MEA() {
        this(false);
    }

    public MEA(Boolean Mandatory) {
        super("MEA", "MEASUREMENTS", "Function: To specify physical measurements, including dimension");
        this.setMandatory(Mandatory);
        e6311 = new E6311();
        eC502 = new C502();
        eC174 = new C174();
        e7383 = new E7383();
        addElement(e6311);
        addElement(eC502);
        addElement(eC174);
        addElement(e7383);
        e6311.setMandatory(true);
    }

}
