package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GIN extends Segment {

    public E7405 e7405;
    public C208 eC208_1;
    public C208 eC208_2;
    public C208 eC208_3;
    public C208 eC208_4;
    public C208 eC208_5;

    public GIN() {
        this(false);
    }

    public GIN(Boolean Mandatory) {
        super("GIN", "GOODS IDENTITY NUMBER", "Function: To give specific identification numbers, either as");
        this.setMandatory(Mandatory);
        e7405 = new E7405();
        eC208_1 = new C208();
        eC208_2 = new C208();
        eC208_3 = new C208();
        eC208_4 = new C208();
        eC208_5 = new C208();
        addElement(e7405);
        addElement(eC208_1);
        addElement(eC208_2);
        addElement(eC208_3);
        addElement(eC208_4);
        addElement(eC208_5);
        e7405.setMandatory(true);
        eC208_1.setMandatory(true);
    }

}
