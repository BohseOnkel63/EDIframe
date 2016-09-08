package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CUX extends Segment {

    public C504 eC504_1;
    public C504 eC504_2;
    public E5402 e5402;
    public E6341 e6341;

    public CUX() {
        this(false);
    }

    public CUX(Boolean Mandatory) {
        super("CUX", "CURRENCIES", "Function: To specify currencies used in the transaction and");
        this.setMandatory(Mandatory);
        eC504_1 = new C504();
        eC504_2 = new C504();
        e5402 = new E5402();
        e6341 = new E6341();
        addElement(eC504_1);
        addElement(eC504_2);
        addElement(e5402);
        addElement(e6341);
    }

}
