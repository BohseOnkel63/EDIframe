package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PRC extends Segment {

    public C242 eC242;

    public PRC() {
        this(false);
    }

    public PRC(Boolean Mandatory) {
        super("PRC", "PROCESS IDENTIFICATION", "Function: To identify a process.");
        this.setMandatory(Mandatory);
        eC242 = new C242();
        addElement(eC242);
        eC242.setMandatory(true);
    }

}
