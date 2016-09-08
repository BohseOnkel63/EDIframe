package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class HAN extends Segment {

    public C524 eC524;
    public C218 eC218;

    public HAN() {
        this(false);
    }

    public HAN(Boolean Mandatory) {
        super("HAN", "HANDLING INSTRUCTIONS", "Function: To specify handling and where necessary, notify");
        this.setMandatory(Mandatory);
        eC524 = new C524();
        eC218 = new C218();
        addElement(eC524);
        addElement(eC218);
    }

}
