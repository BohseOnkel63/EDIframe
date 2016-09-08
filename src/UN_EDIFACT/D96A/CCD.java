package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CCD extends Segment {

    public E4505 e4505;
    public E4507 e4507;
    public E4509 e4509;

    public CCD() {
        this(false);
    }

    public CCD(Boolean Mandatory) {
        super("CCD", "CREDIT COVER DETAILS", "Function: To request a credit cover, reply to that request and");
        this.setMandatory(Mandatory);
        e4505 = new E4505();
        e4507 = new E4507();
        e4509 = new E4509();
        addElement(e4505);
        addElement(e4507);
        addElement(e4509);
    }

}
