package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class RFF extends Segment {

    public C506 eC506;

    public RFF() {
        this(false);
    }

    public RFF(Boolean Mandatory) {
        super("RFF", "REFERENCE", "Function: To specify a reference.");
        this.setMandatory(Mandatory);
        eC506 = new C506();
        addElement(eC506);
        eC506.setMandatory(true);
    }

}
