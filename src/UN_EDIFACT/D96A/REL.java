package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class REL extends Segment {

    public E9141 e9141;
    public C941 eC941;

    public REL() {
        this(false);
    }

    public REL(Boolean Mandatory) {
        super("REL", "RELATIONSHIP", "Function: To identify the direct relationship between the");
        this.setMandatory(Mandatory);
        e9141 = new E9141();
        eC941 = new C941();
        addElement(e9141);
        addElement(eC941);
        e9141.setMandatory(true);
    }

}
