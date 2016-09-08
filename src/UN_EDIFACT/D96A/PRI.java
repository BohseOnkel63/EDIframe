package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PRI extends Segment {

    public C509 eC509;
    public E5213 e5213;
    public E4407 e4407;
    public E7039 e7039;
    public C526 eC526;
    public E7045 e7045;
    public E7047 e7047;
    public C514 eC514_1;
    public C514 eC514_2;
    public C514 eC514_3;

    public PRI() {
        this(false);
    }

    public PRI(Boolean Mandatory) {
        super("PRI", "PRICE DETAILS", "Function: To define the physical sample parameters associated");
        this.setMandatory(Mandatory);
        eC509 = new C509();
        e5213 = new E5213();
        e4407 = new E4407();
        e7039 = new E7039();
        eC526 = new C526();
        e7045 = new E7045();
        e7047 = new E7047();
        eC514_1 = new C514();
        eC514_2 = new C514();
        eC514_3 = new C514();
        addElement(eC509);
        addElement(e5213);
        addElement(e4407);
        addElement(e7039);
        addElement(eC526);
        addElement(e7045);
        addElement(e7047);
        addElement(eC514_1);
        addElement(eC514_2);
        addElement(eC514_3);
    }

}
