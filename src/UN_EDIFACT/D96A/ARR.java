package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ARR extends Segment {

    public C778 eC778;
    public C770 eC770;

    public ARR() {
        this(false);
    }

    public ARR(Boolean Mandatory) {
        super("ARR", "ARRAY INFORMATION", "Function: To contain the data in a array.");
        this.setMandatory(Mandatory);
        eC778 = new C778();
        eC770 = new C770();
        addElement(eC778);
        addElement(eC770);
    }

}
