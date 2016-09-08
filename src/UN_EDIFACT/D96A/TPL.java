package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TPL extends Segment {

    public C222 eC222;

    public TPL() {
        this(false);
    }

    public TPL(Boolean Mandatory) {
        super("TPL", "TRANSPORT PLACEMENT", "Function: To specify placement of goods or equipment in relation");
        this.setMandatory(Mandatory);
        eC222 = new C222();
        addElement(eC222);
        eC222.setMandatory(true);
    }

}
