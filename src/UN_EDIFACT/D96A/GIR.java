package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GIR extends Segment {

    public E7297 e7297;
    public C206 eC206_1;
    public C206 eC206_2;
    public C206 eC206_3;
    public C206 eC206_4;
    public C206 eC206_5;

    public GIR() {
        this(false);
    }

    public GIR(Boolean Mandatory) {
        super("GIR", "RELATED IDENTIFICATION NUMBERS", "Function: To specify a related set of identification numbers.");
        this.setMandatory(Mandatory);
        e7297 = new E7297();
        eC206_1 = new C206();
        eC206_2 = new C206();
        eC206_3 = new C206();
        eC206_4 = new C206();
        eC206_5 = new C206();
        addElement(e7297);
        addElement(eC206_1);
        addElement(eC206_2);
        addElement(eC206_3);
        addElement(eC206_4);
        addElement(eC206_5);
        e7297.setMandatory(true);
        eC206_1.setMandatory(true);
    }

}
