package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CAV extends Segment {

    public C889 eC889;

    public CAV() {
        this(false);
    }

    public CAV(Boolean Mandatory) {
        super("CAV", "CHARACTERISTIC VALUE", "Function: To provide the value of a characteristic.");
        this.setMandatory(Mandatory);
        eC889 = new C889();
        addElement(eC889);
        eC889.setMandatory(true);
    }

}
