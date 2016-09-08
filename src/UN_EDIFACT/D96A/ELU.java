package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ELU extends Segment {

    public E9162 e9162;
    public E7299 e7299;
    public E1050 e1050;
    public E4513 e4513;

    public ELU() {
        this(false);
    }

    public ELU(Boolean Mandatory) {
        super("ELU", "DATA ELEMENT USAGE DETAILS", "Function: To specify the usage of a data element.");
        this.setMandatory(Mandatory);
        e9162 = new E9162();
        e7299 = new E7299();
        e1050 = new E1050();
        e4513 = new E4513();
        addElement(e9162);
        addElement(e7299);
        addElement(e1050);
        addElement(e4513);
        e9162.setMandatory(true);
    }

}
