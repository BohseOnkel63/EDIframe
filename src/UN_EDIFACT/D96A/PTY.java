package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PTY extends Segment {

    public E4035 e4035;
    public C585 eC585;

    public PTY() {
        this(false);
    }

    public PTY(Boolean Mandatory) {
        super("PTY", "PRIORITY", "Function: The segment is used to communicate priority");
        this.setMandatory(Mandatory);
        e4035 = new E4035();
        eC585 = new C585();
        addElement(e4035);
        addElement(eC585);
        e4035.setMandatory(true);
    }

}
