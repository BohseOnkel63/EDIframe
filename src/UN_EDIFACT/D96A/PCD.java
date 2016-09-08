package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PCD extends Segment {

    public C501 eC501;

    public PCD() {
        this(false);
    }

    public PCD(Boolean Mandatory) {
        super("PCD", "PERCENTAGE DETAILS", "Function: To specify percentage information.");
        this.setMandatory(Mandatory);
        eC501 = new C501();
        addElement(eC501);
        eC501.setMandatory(true);
    }

}
