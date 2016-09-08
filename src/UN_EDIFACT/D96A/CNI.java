package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CNI extends Segment {

    public E1490 e1490;
    public C503 eC503;
    public E1312 e1312;

    public CNI() {
        this(false);
    }

    public CNI(Boolean Mandatory) {
        super("CNI", "CONSIGNMENT INFORMATION", "Function: To identify one consignment.");
        this.setMandatory(Mandatory);
        e1490 = new E1490();
        eC503 = new C503();
        e1312 = new E1312();
        addElement(e1490);
        addElement(eC503);
        addElement(e1312);
    }

}
