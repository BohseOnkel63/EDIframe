package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class COM extends Segment {

    public C076 eC076;

    public COM() {
        this(false);
    }

    public COM(Boolean Mandatory) {
        super("COM", "COMMUNICATION CONTACT", "Function: To identify a communication number of a department or");
        this.setMandatory(Mandatory);
        eC076 = new C076();
        addElement(eC076);
        eC076.setMandatory(true);
    }

}
