package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C784 extends CompositeElement {
    public E9432 e9432;
    public E7405 e7405;


    public C784() {
        this(false, null, null);
    }


    public C784(Boolean Mandatory, String s9432, String s7405) {
        super("C784", "FOOTNOTE IDENTIFICATION", "The identification of a footnote.");
        this.setMandatory(Mandatory);
        e9432 = new E9432();
        e7405 = new E7405();
        e9432.setContent(s9432);
        e9432.setMandatory(true);
        e7405.setContent(s7405);
        addElement(e9432);
        addElement(e7405);
    }


}

