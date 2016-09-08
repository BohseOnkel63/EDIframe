package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DTM extends Segment {

    public C507 eC507;

    public DTM() {
        this(false);
    }

    public DTM(Boolean Mandatory) {
        super("DTM", "DATE/TIME/PERIOD", "Function: To specify date, and/or time, or period.");
        this.setMandatory(Mandatory);
        eC507 = new C507();
        addElement(eC507);
        eC507.setMandatory(true);
    }

}
