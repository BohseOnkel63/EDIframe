package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CED extends Segment {

    public E1501 e1501;
    public C079 eC079;

    public CED() {
        this(false);
    }

    public CED(Boolean Mandatory) {
        super("CED", "COMPUTER ENVIRONMENT DETAILS", "Function: To give a precise definition of all necessary elements");
        this.setMandatory(Mandatory);
        e1501 = new E1501();
        eC079 = new C079();
        addElement(e1501);
        addElement(eC079);
        e1501.setMandatory(true);
        eC079.setMandatory(true);
    }

}
