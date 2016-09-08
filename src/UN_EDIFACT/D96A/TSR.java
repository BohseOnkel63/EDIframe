package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TSR extends Segment {

    public C536 eC536;
    public C233 eC233;
    public C537 eC537;
    public C703 eC703;

    public TSR() {
        this(false);
    }

    public TSR(Boolean Mandatory) {
        super("TSR", "TRANSPORT SERVICE REQUIREMENTS", "Function: To specify the contract and carriage conditions and");
        this.setMandatory(Mandatory);
        eC536 = new C536();
        eC233 = new C233();
        eC537 = new C537();
        eC703 = new C703();
        addElement(eC536);
        addElement(eC233);
        addElement(eC537);
        addElement(eC703);
    }

}
