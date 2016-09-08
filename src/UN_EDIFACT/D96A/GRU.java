package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GRU extends Segment {

    public E9164 e9164;
    public E7299 e7299;
    public E6176 e6176;
    public E4513 e4513;
    public E1050 e1050;

    public GRU() {
        this(false);
    }

    public GRU(Boolean Mandatory) {
        super("GRU", "SEGMENT GROUP USAGE DETAILS", "Function: To specify the usage of a segment group within a");
        this.setMandatory(Mandatory);
        e9164 = new E9164();
        e7299 = new E7299();
        e6176 = new E6176();
        e4513 = new E4513();
        e1050 = new E1050();
        addElement(e9164);
        addElement(e7299);
        addElement(e6176);
        addElement(e4513);
        addElement(e1050);
        e9164.setMandatory(true);
    }

}
