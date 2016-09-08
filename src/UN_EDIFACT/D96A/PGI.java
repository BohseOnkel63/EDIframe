package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PGI extends Segment {

    public E5379 e5379;
    public C288 eC288;

    public PGI() {
        this(false);
    }

    public PGI(Boolean Mandatory) {
        super("PGI", "PRODUCT GROUP INFORMATION", "Function: To indicate the group in which a product belongs.");
        this.setMandatory(Mandatory);
        e5379 = new E5379();
        eC288 = new C288();
        addElement(e5379);
        addElement(eC288);
        e5379.setMandatory(true);
    }

}
