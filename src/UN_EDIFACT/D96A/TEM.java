package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TEM extends Segment {

    public C244 eC244;
    public E4419 e4419;
    public E3077 e3077;
    public E6311 e6311;
    public E7188 e7188;
    public C515 eC515;
    public C219 eC219;
    public E8332 e8332;
    public E8341 e8341;

    public TEM() {
        this(false);
    }

    public TEM(Boolean Mandatory) {
        super("TEM", "TEST METHOD", "Function: To describe the nature of the test performed.");
        this.setMandatory(Mandatory);
        eC244 = new C244();
        e4419 = new E4419();
        e3077 = new E3077();
        e6311 = new E6311();
        e7188 = new E7188();
        eC515 = new C515();
        eC219 = new C219();
        e8332 = new E8332();
        e8341 = new E8341();
        addElement(eC244);
        addElement(e4419);
        addElement(e3077);
        addElement(e6311);
        addElement(e7188);
        addElement(eC515);
        addElement(eC219);
        addElement(e8332);
        addElement(e8341);
    }

}
