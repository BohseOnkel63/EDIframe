package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CST extends Segment {

    public E1496 e1496;
    public C246 eC246_1;
    public C246 eC246_2;
    public C246 eC246_3;
    public C246 eC246_4;
    public C246 eC246_5;

    public CST() {
        this(false);
    }

    public CST(Boolean Mandatory) {
        super("CST", "CUSTOMS STATUS OF GOODS", "Function: To specify goods in terms of customs identities,");
        this.setMandatory(Mandatory);
        e1496 = new E1496();
        eC246_1 = new C246();
        eC246_2 = new C246();
        eC246_3 = new C246();
        eC246_4 = new C246();
        eC246_5 = new C246();
        addElement(e1496);
        addElement(eC246_1);
        addElement(eC246_2);
        addElement(eC246_3);
        addElement(eC246_4);
        addElement(eC246_5);
    }

}
