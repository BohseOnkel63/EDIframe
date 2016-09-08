package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SCD extends Segment {

    public E7497 e7497;
    public C786 eC786;
    public C082 eC082;
    public E4405 e4405;
    public E1222 e1222;
    public C778 eC778;
    public C240 eC240;

    public SCD() {
        this(false);
    }

    public SCD(Boolean Mandatory) {
        super("SCD", "STRUCTURE COMPONENT DEFINITION", "Function: To specify a component of a data structure (e.g. an");
        this.setMandatory(Mandatory);
        e7497 = new E7497();
        eC786 = new C786();
        eC082 = new C082();
        e4405 = new E4405();
        e1222 = new E1222();
        eC778 = new C778();
        eC240 = new C240();
        addElement(e7497);
        addElement(eC786);
        addElement(eC082);
        addElement(e4405);
        addElement(e1222);
        addElement(eC778);
        addElement(eC240);
        e7497.setMandatory(true);
    }

}
