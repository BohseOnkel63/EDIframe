package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class MKS extends Segment {

    public E7293 e7293;
    public C332 eC332;
    public E1229 e1229;

    public MKS() {
        this(false);
    }

    public MKS(Boolean Mandatory) {
        super("MKS", "MARKET/SALES CHANNEL INFORMATION", "Function: To specify to which market and/or through which sales");
        this.setMandatory(Mandatory);
        e7293 = new E7293();
        eC332 = new C332();
        e1229 = new E1229();
        addElement(e7293);
        addElement(eC332);
        addElement(e1229);
        e7293.setMandatory(true);
        eC332.setMandatory(true);
    }

}
