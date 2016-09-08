package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class BII extends Segment {

    public E7429 e7429;
    public C045 eC045;
    public E7140 e7140;

    public BII() {
        this(false);
    }

    public BII(Boolean Mandatory) {
        super("BII", "STRUCTURE IDENTIFICATION", "Function: A segment used to convey an indexing structure");
        this.setMandatory(Mandatory);
        e7429 = new E7429();
        eC045 = new C045();
        e7140 = new E7140();
        addElement(e7429);
        addElement(eC045);
        addElement(e7140);
        e7429.setMandatory(true);
        eC045.setMandatory(true);
    }

}
