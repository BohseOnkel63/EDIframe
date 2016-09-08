package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class EMP extends Segment {

    public E9003 e9003;
    public C948 eC948;
    public C951 eC951;
    public C950 eC950;
    public E3494 e3494;
    public E9035 e9035;

    public EMP() {
        this(false);
    }

    public EMP(Boolean Mandatory) {
        super("EMP", "EMPLOYMENT DETAILS", "Function: To specify employment details.");
        this.setMandatory(Mandatory);
        e9003 = new E9003();
        eC948 = new C948();
        eC951 = new C951();
        eC950 = new C950();
        e3494 = new E3494();
        e9035 = new E9035();
        addElement(e9003);
        addElement(eC948);
        addElement(eC951);
        addElement(eC950);
        addElement(e3494);
        addElement(e9035);
        e9003.setMandatory(true);
    }

}
