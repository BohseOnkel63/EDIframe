package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class EQA extends Segment {

    public E8053 e8053;
    public C237 eC237;

    public EQA() {
        this(false);
    }

    public EQA(Boolean Mandatory) {
        super("EQA", "ATTACHED EQUIPMENT", "Function: To specify attached or related equipment.");
        this.setMandatory(Mandatory);
        e8053 = new E8053();
        eC237 = new C237();
        addElement(e8053);
        addElement(eC237);
        e8053.setMandatory(true);
    }

}
