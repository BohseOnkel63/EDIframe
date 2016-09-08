package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TDT extends Segment {

    public E8051 e8051;
    public E8028 e8028;
    public C220 eC220;
    public C228 eC228;
    public C040 eC040;
    public E8101 e8101;
    public C401 eC401;
    public C222 eC222;
    public E8281 e8281;

    public TDT() {
        this(false);
    }

    public TDT(Boolean Mandatory) {
        super("TDT", "DETAILS OF TRANSPORT", "Function: To specify the transport details such as mode of");
        this.setMandatory(Mandatory);
        e8051 = new E8051();
        e8028 = new E8028();
        eC220 = new C220();
        eC228 = new C228();
        eC040 = new C040();
        e8101 = new E8101();
        eC401 = new C401();
        eC222 = new C222();
        e8281 = new E8281();
        addElement(e8051);
        addElement(e8028);
        addElement(eC220);
        addElement(eC228);
        addElement(eC040);
        addElement(e8101);
        addElement(eC401);
        addElement(eC222);
        addElement(e8281);
        e8051.setMandatory(true);
    }

}
