package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class FCA extends Segment {

    public E4471 e4471;
    public C878 eC878;

    public FCA() {
        this(false);
    }

    public FCA(Boolean Mandatory) {
        super("FCA", "FINANCIAL CHARGES ALLOCATION", "Function: Description of allocation of charges.");
        this.setMandatory(Mandatory);
        e4471 = new E4471();
        eC878 = new C878();
        addElement(e4471);
        addElement(eC878);
        e4471.setMandatory(true);
    }

}
