package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class FII extends Segment {

    public E3035 e3035;
    public C078 eC078;
    public C088 eC088;
    public E3207 e3207;

    public FII() {
        this(false);
    }

    public FII(Boolean Mandatory) {
        super("FII", "FINANCIAL INSTITUTION INFORMATION", "Function: To identify an account and a related financial");
        this.setMandatory(Mandatory);
        e3035 = new E3035();
        eC078 = new C078();
        eC088 = new C088();
        e3207 = new E3207();
        addElement(e3035);
        addElement(eC078);
        addElement(eC088);
        addElement(e3207);
        e3035.setMandatory(true);
    }

}
