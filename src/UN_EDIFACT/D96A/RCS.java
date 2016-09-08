package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class RCS extends Segment {

    public E7293 e7293;
    public C550 eC550;
    public E1229 e1229;

    public RCS() {
        this(false);
    }

    public RCS(Boolean Mandatory) {
        super("RCS", "REQUIREMENTS AND CONDITIONS", "Function: To specify sector/subject requirements and conditions.");
        this.setMandatory(Mandatory);
        e7293 = new E7293();
        eC550 = new C550();
        e1229 = new E1229();
        addElement(e7293);
        addElement(eC550);
        addElement(e1229);
        e7293.setMandatory(true);
    }

}
