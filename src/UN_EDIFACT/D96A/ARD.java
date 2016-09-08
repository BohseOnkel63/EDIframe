package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ARD extends Segment {

    public C549 eC549;

    public ARD() {
        this(false);
    }

    public ARD(Boolean Mandatory) {
        super("ARD", "AMOUNTS RELATIONSHIP DETAILS", "Function: To provide details of the function of a monetary");
        this.setMandatory(Mandatory);
        eC549 = new C549();
        addElement(eC549);
    }

}
