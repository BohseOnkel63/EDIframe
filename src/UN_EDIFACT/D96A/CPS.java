package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CPS extends Segment {

    public E7164 e7164;
    public E7166 e7166;
    public E7075 e7075;

    public CPS() {
        this(false);
    }

    public CPS(Boolean Mandatory) {
        super("CPS", "CONSIGNMENT PACKING SEQUENCE", "Function: To identify the sequence in which physical packing is");
        this.setMandatory(Mandatory);
        e7164 = new E7164();
        e7166 = new E7166();
        e7075 = new E7075();
        addElement(e7164);
        addElement(e7166);
        addElement(e7075);
        e7164.setMandatory(true);
    }

}
