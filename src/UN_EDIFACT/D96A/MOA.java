package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class MOA extends Segment {

    public C516 eC516;

    public MOA() {
        this(false);
    }

    public MOA(Boolean Mandatory) {
        super("MOA", "MONETARY AMOUNT", "Function: To specify a monetary amount.");
        this.setMandatory(Mandatory);
        eC516 = new C516();
        addElement(eC516);
        eC516.setMandatory(true);
    }

}
