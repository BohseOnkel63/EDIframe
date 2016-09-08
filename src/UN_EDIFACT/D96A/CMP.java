package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CMP extends Segment {

    public E9146 e9146;
    public E1507 e1507;
    public E4513 e4513;

    public CMP() {
        this(false);
    }

    public CMP(Boolean Mandatory) {
        super("CMP", "COMPOSITE DATA ELEMENT IDENTIFICATION", "Function: To identify a composite data element and to give its");
        this.setMandatory(Mandatory);
        e9146 = new E9146();
        e1507 = new E1507();
        e4513 = new E4513();
        addElement(e9146);
        addElement(e1507);
        addElement(e4513);
        e9146.setMandatory(true);
    }

}
