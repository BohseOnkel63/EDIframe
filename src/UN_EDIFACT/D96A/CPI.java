package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CPI extends Segment {

    public C229 eC229;
    public C231 eC231;
    public E4237 e4237;

    public CPI() {
        this(false);
    }

    public CPI(Boolean Mandatory) {
        super("CPI", "CHARGE PAYMENT INSTRUCTIONS", "Function: To identify a charge.");
        this.setMandatory(Mandatory);
        eC229 = new C229();
        eC231 = new C231();
        e4237 = new E4237();
        addElement(eC229);
        addElement(eC231);
        addElement(e4237);
    }

}
