package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PIA extends Segment {

    public E4347 e4347;
    public C212 eC212_1;
    public C212 eC212_2;
    public C212 eC212_3;
    public C212 eC212_4;
    public C212 eC212_5;
    public E1082 e1082;
    public E1229 e1229;
    public C292 eC292;
    public E7011 e7011;
    public E5495 e5495;
    public E1222 e1222;
    public E7083 e7083;

    public PIA() {
        this(false);
    }

    public PIA(Boolean Mandatory) {
        super("PIA", "ADDITIONAL PRODUCT ID", "Function: To specify details relating to pricing of a product.");
        this.setMandatory(Mandatory);
        e4347 = new E4347();
        eC212_1 = new C212();
        eC212_2 = new C212();
        eC212_3 = new C212();
        eC212_4 = new C212();
        eC212_5 = new C212();
        e1082 = new E1082();
        e1229 = new E1229();
        eC292 = new C292();
        e7011 = new E7011();
        e5495 = new E5495();
        e1222 = new E1222();
        e7083 = new E7083();
        addElement(e4347);
        addElement(eC212_1);
        addElement(eC212_2);
        addElement(eC212_3);
        addElement(eC212_4);
        addElement(eC212_5);
        addElement(e1082);
        addElement(e1229);
        addElement(eC292);
        addElement(e7011);
        addElement(e5495);
        addElement(e1222);
        addElement(e7083);
        e4347.setMandatory(true);
        eC212_1.setMandatory(true);
    }

}
