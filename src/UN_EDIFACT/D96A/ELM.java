package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ELM extends Segment {

    public E9150 e9150;
    public E9153 e9153;
    public E9155 e9155;
    public E9156 e9156;
    public E9158 e9158;
    public E9161 e9161;
    public E1507 e1507;
    public E4513 e4513;

    public ELM() {
        this(false);
    }

    public ELM(Boolean Mandatory) {
        super("ELM", "SIMPLE DATA ELEMENT DETAILS", "Function: To identify a simple data element and give related");
        this.setMandatory(Mandatory);
        e9150 = new E9150();
        e9153 = new E9153();
        e9155 = new E9155();
        e9156 = new E9156();
        e9158 = new E9158();
        e9161 = new E9161();
        e1507 = new E1507();
        e4513 = new E4513();
        addElement(e9150);
        addElement(e9153);
        addElement(e9155);
        addElement(e9156);
        addElement(e9158);
        addElement(e9161);
        addElement(e1507);
        addElement(e4513);
        e9150.setMandatory(true);
    }

}
