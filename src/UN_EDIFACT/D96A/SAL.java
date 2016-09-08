package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SAL extends Segment {

    public C049 eC049;

    public SAL() {
        this(false);
    }

    public SAL(Boolean Mandatory) {
        super("SAL", "REMUNERATION TYPE IDENTIFICATION", "Function: Identification of a remuneration type.");
        this.setMandatory(Mandatory);
        eC049 = new C049();
        addElement(eC049);
    }

}
