package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GOR extends Segment {

    public E8323 e8323;
    public C232 eC232_1;
    public C232 eC232_2;
    public C232 eC232_3;
    public C232 eC232_4;

    public GOR() {
        this(false);
    }

    public GOR(Boolean Mandatory) {
        super("GOR", "GOVERNMENTAL REQUIREMENTS", "Function: To indicate the requirement for a specific govermental");
        this.setMandatory(Mandatory);
        e8323 = new E8323();
        eC232_1 = new C232();
        eC232_2 = new C232();
        eC232_3 = new C232();
        eC232_4 = new C232();
        addElement(e8323);
        addElement(eC232_1);
        addElement(eC232_2);
        addElement(eC232_3);
        addElement(eC232_4);
    }

}
