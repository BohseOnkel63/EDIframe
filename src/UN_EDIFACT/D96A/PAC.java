package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PAC extends Segment {

    public E7224 e7224;
    public C531 eC531;
    public C202 eC202;
    public C402 eC402;
    public C532 eC532;

    public PAC() {
        this(false);
    }

    public PAC(Boolean Mandatory) {
        super("PAC", "PACKAGE", "Function: To describe the number and type of packages/physical");
        this.setMandatory(Mandatory);
        e7224 = new E7224();
        eC531 = new C531();
        eC202 = new C202();
        eC402 = new C402();
        eC532 = new C532();
        addElement(e7224);
        addElement(eC531);
        addElement(eC202);
        addElement(eC402);
        addElement(eC532);
    }

}
