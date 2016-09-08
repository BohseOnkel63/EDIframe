package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class FNS extends Segment {

    public C783 eC783;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public FNS() {
        this(false);
    }

    public FNS(Boolean Mandatory) {
        super("FNS", "FOOTNOTE SET", "Function: To identify a set of footnotes.");
        this.setMandatory(Mandatory);
        eC783 = new C783();
        eC082 = new C082();
        e4405 = new E4405();
        e4513 = new E4513();
        addElement(eC783);
        addElement(eC082);
        addElement(e4405);
        addElement(e4513);
        eC783.setMandatory(true);
    }

}
