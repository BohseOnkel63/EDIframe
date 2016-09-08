package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class RTE extends Segment {

    public C128 eC128;

    public RTE() {
        this(false);
    }

    public RTE(Boolean Mandatory) {
        super("RTE", "RATE DETAILS", "Function: To specify rate information.");
        this.setMandatory(Mandatory);
        eC128 = new C128();
        addElement(eC128);
        eC128.setMandatory(true);
    }

}
