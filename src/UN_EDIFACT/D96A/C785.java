package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C785 extends CompositeElement {
    public E6434 e6434;
    public E7405 e7405;


    public C785() {
        this(false, null, null);
    }


    public C785(Boolean Mandatory, String s6434, String s7405) {
        super("C785", "STATISTICAL CONCEPT IDENTIFICATION", "The identification of a statistical concept.");
        this.setMandatory(Mandatory);
        e6434 = new E6434();
        e7405 = new E7405();
        e6434.setContent(s6434);
        e6434.setMandatory(true);
        e7405.setContent(s7405);
        addElement(e6434);
        addElement(e7405);
    }


}

