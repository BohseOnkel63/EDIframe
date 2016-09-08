package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class FTX extends Segment {

    public E4451 e4451;
    public E4453 e4453;
    public C107 eC107;
    public C108 eC108;
    public E3453 e3453;

    public FTX() {
        this(false);
    }

    public FTX(Boolean Mandatory) {
        super("FTX", "FREE TEXT", "Function: To provide free form or coded text information.");
        this.setMandatory(Mandatory);
        e4451 = new E4451();
        e4453 = new E4453();
        eC107 = new C107();
        eC108 = new C108();
        e3453 = new E3453();
        addElement(e4451);
        addElement(e4453);
        addElement(eC107);
        addElement(eC108);
        addElement(e3453);
        e4451.setMandatory(true);
    }

}
