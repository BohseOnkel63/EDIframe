package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class INV extends Segment {

    public E4501 e4501;
    public E7491 e7491;
    public E4499 e4499;
    public E4503 e4503;
    public C522 eC522;

    public INV() {
        this(false);
    }

    public INV(Boolean Mandatory) {
        super("INV", "INVENTORY MANAGEMENT RELATED DETAILS", "Function: To provide the different information related to the");
        this.setMandatory(Mandatory);
        e4501 = new E4501();
        e7491 = new E7491();
        e4499 = new E4499();
        e4503 = new E4503();
        eC522 = new C522();
        addElement(e4501);
        addElement(e7491);
        addElement(e4499);
        addElement(e4503);
        addElement(eC522);
    }

}
