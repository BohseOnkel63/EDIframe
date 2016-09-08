package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TOD extends Segment {

    public E4055 e4055;
    public E4215 e4215;
    public C100 eC100;

    public TOD() {
        this(false);
    }

    public TOD(Boolean Mandatory) {
        super("TOD", "TERMS OF DELIVERY OR TRANSPORT", "Function: To specify terms of delivery or transport.");
        this.setMandatory(Mandatory);
        e4055 = new E4055();
        e4215 = new E4215();
        eC100 = new C100();
        addElement(e4055);
        addElement(e4215);
        addElement(eC100);
    }

}
