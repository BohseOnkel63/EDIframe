package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SEL extends Segment {

    public E9308 e9308;
    public C215 eC215;
    public E4517 e4517;

    public SEL() {
        this(false);
    }

    public SEL(Boolean Mandatory) {
        super("SEL", "SEAL NUMBER", "Function: To specify a seal number related to equipment.");
        this.setMandatory(Mandatory);
        e9308 = new E9308();
        eC215 = new C215();
        e4517 = new E4517();
        addElement(e9308);
        addElement(eC215);
        addElement(e4517);
        e9308.setMandatory(true);
    }

}
