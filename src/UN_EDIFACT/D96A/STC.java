package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class STC extends Segment {

    public C785 eC785;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public STC() {
        this(false);
    }

    public STC(Boolean Mandatory) {
        super("STC", "STATISTICAL CONCEPT", "Function: To specify a statistical concept.");
        this.setMandatory(Mandatory);
        eC785 = new C785();
        eC082 = new C082();
        e4405 = new E4405();
        e4513 = new E4513();
        addElement(eC785);
        addElement(eC082);
        addElement(e4405);
        addElement(e4513);
        eC785.setMandatory(true);
    }

}
