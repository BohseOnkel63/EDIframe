package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class VLI extends Segment {

    public C780 eC780;
    public C082 eC082;
    public E4405 e4405;
    public E1514 e1514;
    public E1507 e1507;
    public E1505 e1505;
    public C240 eC240;
    public E4513 e4513;

    public VLI() {
        this(false);
    }

    public VLI(Boolean Mandatory) {
        super("VLI", "VALUE LIST IDENTIFICATION", "Function: To identify a coded or non coded value list.");
        this.setMandatory(Mandatory);
        eC780 = new C780();
        eC082 = new C082();
        e4405 = new E4405();
        e1514 = new E1514();
        e1507 = new E1507();
        e1505 = new E1505();
        eC240 = new C240();
        e4513 = new E4513();
        addElement(eC780);
        addElement(eC082);
        addElement(e4405);
        addElement(e1514);
        addElement(e1507);
        addElement(e1505);
        addElement(eC240);
        addElement(e4513);
        eC780.setMandatory(true);
    }

}
