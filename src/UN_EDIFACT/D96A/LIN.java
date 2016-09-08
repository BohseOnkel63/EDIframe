package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class LIN extends Segment {

    public E1082 e1082;
    public E1229 e1229;
    public C212 eC212;
    public C829 eC829;
    public E1222 e1222;
    public E7083 e7083;

    public LIN() {
        this(false);
    }

    public LIN(Boolean Mandatory) {
        super("LIN", "LINE ITEM", "Function: To identify a line item and configuration.");
        this.setMandatory(Mandatory);
        e1082 = new E1082();
        e1229 = new E1229();
        eC212 = new C212();
        eC829 = new C829();
        e1222 = new E1222();
        e7083 = new E7083();
        addElement(e1082);
        addElement(e1229);
        addElement(eC212);
        addElement(eC829);
        addElement(e1222);
        addElement(e7083);
    }

}
