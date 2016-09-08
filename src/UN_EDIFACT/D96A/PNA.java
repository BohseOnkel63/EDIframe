package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PNA extends Segment {

    public E3035 e3035;
    public C206 eC206;
    public C082 eC082;
    public E3403 e3403;
    public E3397 e3397;
    public C816 eC816_1;
    public C816 eC816_2;
    public C816 eC816_3;
    public C816 eC816_4;
    public C816 eC816_5;

    public PNA() {
        this(false);
    }

    public PNA(Boolean Mandatory) {
        super("PNA", "PARTY NAME", "Function: To specify information necessary to establish the");
        this.setMandatory(Mandatory);
        e3035 = new E3035();
        eC206 = new C206();
        eC082 = new C082();
        e3403 = new E3403();
        e3397 = new E3397();
        eC816_1 = new C816();
        eC816_2 = new C816();
        eC816_3 = new C816();
        eC816_4 = new C816();
        eC816_5 = new C816();
        addElement(e3035);
        addElement(eC206);
        addElement(eC082);
        addElement(e3403);
        addElement(e3397);
        addElement(eC816_1);
        addElement(eC816_2);
        addElement(eC816_3);
        addElement(eC816_4);
        addElement(eC816_5);
        e3035.setMandatory(true);
    }

}
