package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CDV extends Segment {

    public E9426 e9426;
    public E9434 e9434;
    public E4513 e4513;

    public CDV() {
        this(false);
    }

    public CDV(Boolean Mandatory) {
        super("CDV", "CODE VALUE DEFINITION", "Function: To provide information related to a code value.");
        this.setMandatory(Mandatory);
        e9426 = new E9426();
        e9434 = new E9434();
        e4513 = new E4513();
        addElement(e9426);
        addElement(e9434);
        addElement(e4513);
        e9426.setMandatory(true);
    }

}
