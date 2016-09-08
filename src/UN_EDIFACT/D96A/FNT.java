package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class FNT extends Segment {

    public C784 eC784;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public FNT() {
        this(false);
    }

    public FNT(Boolean Mandatory) {
        super("FNT", "FOOTNOTE", "Function: To identify a footnote.");
        this.setMandatory(Mandatory);
        eC784 = new C784();
        eC082 = new C082();
        e4405 = new E4405();
        e4513 = new E4513();
        addElement(eC784);
        addElement(eC082);
        addElement(e4405);
        addElement(e4513);
        eC784.setMandatory(true);
    }

}
