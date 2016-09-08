package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SPS extends Segment {

    public C526 eC526;
    public E6074 e6074;
    public C512 eC512_1;
    public C512 eC512_2;
    public C512 eC512_3;
    public C512 eC512_4;
    public C512 eC512_5;

    public SPS() {
        this(false);
    }

    public SPS(Boolean Mandatory) {
        super("SPS", "SAMPLING PARAMETERS FOR SUMMARY STATISTICS", "Function: To define the sampling parameters associated with");
        this.setMandatory(Mandatory);
        eC526 = new C526();
        e6074 = new E6074();
        eC512_1 = new C512();
        eC512_2 = new C512();
        eC512_3 = new C512();
        eC512_4 = new C512();
        eC512_5 = new C512();
        addElement(eC526);
        addElement(e6074);
        addElement(eC512_1);
        addElement(eC512_2);
        addElement(eC512_3);
        addElement(eC512_4);
        addElement(eC512_5);
    }

}
