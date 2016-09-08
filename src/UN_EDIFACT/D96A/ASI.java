package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ASI extends Segment {

    public C779 eC779;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public ASI() {
        this(false);
    }

    public ASI(Boolean Mandatory) {
        super("ASI", "ARRAY STRUCTURE IDENTIFICATION", "Function: To identify the structure of an array.");
        this.setMandatory(Mandatory);
        eC779 = new C779();
        eC082 = new C082();
        e4405 = new E4405();
        e4513 = new E4513();
        addElement(eC779);
        addElement(eC082);
        addElement(e4405);
        addElement(e4513);
        eC779.setMandatory(true);
    }

}
