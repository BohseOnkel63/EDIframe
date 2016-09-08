package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DSI extends Segment {

    public C782 eC782;
    public C082 eC082;
    public E4405 e4405;
    public C286 eC286;
    public E1060 e1060;

    public DSI() {
        this(false);
    }

    public DSI(Boolean Mandatory) {
        super("DSI", "DATA SET IDENTIFICATION", "Function: To identify a data set.");
        this.setMandatory(Mandatory);
        eC782 = new C782();
        eC082 = new C082();
        e4405 = new E4405();
        eC286 = new C286();
        e1060 = new E1060();
        addElement(eC782);
        addElement(eC082);
        addElement(e4405);
        addElement(eC286);
        addElement(e1060);
        eC782.setMandatory(true);
    }

}
