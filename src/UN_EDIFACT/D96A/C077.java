package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C077 extends CompositeElement {
    public E1508 e1508;
    public E7008 e7008;


    public C077() {
        this(false, null, null);
    }


    public C077(Boolean Mandatory, String s1508, String s7008) {
        super("C077", "FILE IDENTIFICATION", "To identify a file.");
        this.setMandatory(Mandatory);
        e1508 = new E1508();
        e7008 = new E7008();
        e1508.setContent(s1508);
        e7008.setContent(s7008);
        addElement(e1508);
        addElement(e7008);
    }


}

