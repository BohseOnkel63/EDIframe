package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C045 extends CompositeElement {
    public E7436 e7436;
    public E7438 e7438;
    public E7440 e7440;
    public E7442 e7442;
    public E7444 e7444;
    public E7446 e7446;


    public C045() {
        this(false, null, null, null, null, null, null);
    }


    public C045(Boolean Mandatory, String s7436, String s7438, String s7440, String s7442, String s7444, String s7446) {
        super("C045", "BILL LEVEL IDENTIFICATION", "A sequenced collection of facetted codes used for multiple indexing purposes.");
        this.setMandatory(Mandatory);
        e7436 = new E7436();
        e7438 = new E7438();
        e7440 = new E7440();
        e7442 = new E7442();
        e7444 = new E7444();
        e7446 = new E7446();
        e7436.setContent(s7436);
        e7438.setContent(s7438);
        e7440.setContent(s7440);
        e7442.setContent(s7442);
        e7444.setContent(s7444);
        e7446.setContent(s7446);
        addElement(e7436);
        addElement(e7438);
        addElement(e7440);
        addElement(e7442);
        addElement(e7444);
        addElement(e7446);
    }


}

