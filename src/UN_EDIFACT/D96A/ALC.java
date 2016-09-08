package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ALC extends Segment {

    public E5463 e5463;
    public C552 eC552;
    public E4471 e4471;
    public E1227 e1227;
    public C214 eC214;

    public ALC() {
        this(false);
    }

    public ALC(Boolean Mandatory) {
        super("ALC", "ALLOWANCE OR CHARGE", "Function: To identify allowance or charge details.");
        this.setMandatory(Mandatory);
        e5463 = new E5463();
        eC552 = new C552();
        e4471 = new E4471();
        e1227 = new E1227();
        eC214 = new C214();
        addElement(e5463);
        addElement(eC552);
        addElement(e4471);
        addElement(e1227);
        addElement(eC214);
        e5463.setMandatory(true);
    }

}
