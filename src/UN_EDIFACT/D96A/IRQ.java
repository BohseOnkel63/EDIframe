package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class IRQ extends Segment {

    public C333 eC333;

    public IRQ() {
        this(false);
    }

    public IRQ(Boolean Mandatory) {
        super("IRQ", "INFORMATION REQUIRED", "Function: To indicate which information is requested in a");
        this.setMandatory(Mandatory);
        eC333 = new C333();
        addElement(eC333);
        eC333.setMandatory(true);
    }

}
