package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GID extends Segment {

    public E1496 e1496;
    public C213 eC213_1;
    public C213 eC213_2;
    public C213 eC213_3;

    public GID() {
        this(false);
    }

    public GID(Boolean Mandatory) {
        super("GID", "GOODS ITEM DETAILS", "Function: To indicate totals of a goods item.");
        this.setMandatory(Mandatory);
        e1496 = new E1496();
        eC213_1 = new C213();
        eC213_2 = new C213();
        eC213_3 = new C213();
        addElement(e1496);
        addElement(eC213_1);
        addElement(eC213_2);
        addElement(eC213_3);
    }

}
