package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class AGR extends Segment {

    public C543 eC543;
    public E9419 e9419;

    public AGR() {
        this(false);
    }

    public AGR(Boolean Mandatory) {
        super("AGR", "AGREEMENT IDENTIFICATION", "Function: To specify the agreement details.");
        this.setMandatory(Mandatory);
        eC543 = new C543();
        e9419 = new E9419();
        addElement(eC543);
        addElement(e9419);
    }

}
