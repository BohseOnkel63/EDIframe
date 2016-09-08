package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SEG extends Segment {

    public E9166 e9166;
    public E1507 e1507;
    public E4513 e4513;

    public SEG() {
        this(false);
    }

    public SEG(Boolean Mandatory) {
        super("SEG", "SEGMENT IDENTIFICATION", "Function: To identify a segment and give its class and");
        this.setMandatory(Mandatory);
        e9166 = new E9166();
        e1507 = new E1507();
        e4513 = new E4513();
        addElement(e9166);
        addElement(e1507);
        addElement(e4513);
        e9166.setMandatory(true);
    }

}
