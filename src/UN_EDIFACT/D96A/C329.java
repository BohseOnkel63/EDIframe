package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C329 extends CompositeElement {
    public E2013 e2013;
    public E2015 e2015;
    public E2017 e2017;


    public C329() {
        this(false, null, null, null);
    }


    public C329(Boolean Mandatory, String s2013, String s2015, String s2017) {
        super("C329", "PATTERN DESCRIPTION", "Shipment, delivery or production interval pattern and timing.");
        this.setMandatory(Mandatory);
        e2013 = new E2013();
        e2015 = new E2015();
        e2017 = new E2017();
        e2013.setContent(s2013);
        e2015.setContent(s2015);
        e2017.setContent(s2017);
        addElement(e2013);
        addElement(e2015);
        addElement(e2017);
    }


}

