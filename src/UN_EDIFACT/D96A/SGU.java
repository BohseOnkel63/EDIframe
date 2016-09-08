package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SGU extends Segment {

    public E9166 e9166;
    public E7299 e7299;
    public E6176 e6176;
    public E7168 e7168;
    public E1050 e1050;
    public E1049 e1049;
    public E4513 e4513;

    public SGU() {
        this(false);
    }

    public SGU(Boolean Mandatory) {
        super("SGU", "SEGMENT USAGE DETAILS", "Function: To specify the details of the usage of a segment");
        this.setMandatory(Mandatory);
        e9166 = new E9166();
        e7299 = new E7299();
        e6176 = new E6176();
        e7168 = new E7168();
        e1050 = new E1050();
        e1049 = new E1049();
        e4513 = new E4513();
        addElement(e9166);
        addElement(e7299);
        addElement(e6176);
        addElement(e7168);
        addElement(e1050);
        addElement(e1049);
        addElement(e4513);
        e9166.setMandatory(true);
    }

}
