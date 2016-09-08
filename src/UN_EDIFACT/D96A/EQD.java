package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class EQD extends Segment {

    public E8053 e8053;
    public C237 eC237;
    public C224 eC224;
    public E8077 e8077;
    public E8249 e8249;
    public E8169 e8169;

    public EQD() {
        this(false);
    }

    public EQD(Boolean Mandatory) {
        super("EQD", "EQUIPMENT DETAILS", "Function: To identify a unit of equipment.");
        this.setMandatory(Mandatory);
        e8053 = new E8053();
        eC237 = new C237();
        eC224 = new C224();
        e8077 = new E8077();
        e8249 = new E8249();
        e8169 = new E8169();
        addElement(e8053);
        addElement(eC237);
        addElement(eC224);
        addElement(e8077);
        addElement(e8249);
        addElement(e8169);
        e8053.setMandatory(true);
    }

}
