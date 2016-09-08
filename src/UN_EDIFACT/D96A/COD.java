package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class COD extends Segment {

    public C823 eC823;
    public C824 eC824;

    public COD() {
        this(false);
    }

    public COD(Boolean Mandatory) {
        super("COD", "COMPONENT DETAILS", "Function: To provide component details of an object (e.g.");
        this.setMandatory(Mandatory);
        eC823 = new C823();
        eC824 = new C824();
        addElement(eC823);
        addElement(eC824);
    }

}
