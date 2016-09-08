package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CCI extends Segment {

    public E7059 e7059;
    public C502 eC502;
    public C240 eC240;
    public E7001 e7001;
    public C564 eC564;

    public CCI() {
        this(false);
    }

    public CCI(Boolean Mandatory) {
        super("CCI", "CHARACTERISTIC/CLASS ID", "Function: To describe a physical or logical state.");
        this.setMandatory(Mandatory);
        e7059 = new E7059();
        eC502 = new C502();
        eC240 = new C240();
        e7001 = new E7001();
        eC564 = new C564();
        addElement(e7059);
        addElement(eC502);
        addElement(eC240);
        addElement(e7001);
        addElement(eC564);
        e7001.setMandatory(true);
        eC564.setMandatory(true);
    }

}
