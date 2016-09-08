package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TCC extends Segment {

    public C200 eC200;
    public C203 eC203;
    public C528 eC528;
    public C554 eC554;

    public TCC() {
        this(false);
    }

    public TCC(Boolean Mandatory) {
        super("TCC", "TRANSPORT CHARGE/RATE CALCULATIONS", "Function: To specify charges.");
        this.setMandatory(Mandatory);
        eC200 = new C200();
        eC203 = new C203();
        eC528 = new C528();
        eC554 = new C554();
        addElement(eC200);
        addElement(eC203);
        addElement(eC528);
        addElement(eC554);
    }

}
