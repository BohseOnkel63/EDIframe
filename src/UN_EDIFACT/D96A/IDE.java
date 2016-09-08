package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class IDE extends Segment {

    public E7495 e7495;
    public C206 eC206;
    public C082 eC082;
    public E4405 e4405;
    public E1222 e1222;
    public C778 eC778;
    public C240 eC240;

    public IDE() {
        this(false);
    }

    public IDE(Boolean Mandatory) {
        super("IDE", "IDENTITY", "Function: To identify an object.");
        this.setMandatory(Mandatory);
        e7495 = new E7495();
        eC206 = new C206();
        eC082 = new C082();
        e4405 = new E4405();
        e1222 = new E1222();
        eC778 = new C778();
        eC240 = new C240();
        addElement(e7495);
        addElement(eC206);
        addElement(eC082);
        addElement(e4405);
        addElement(e1222);
        addElement(eC778);
        addElement(eC240);
        e7495.setMandatory(true);
        eC206.setMandatory(true);
    }

}
