package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C829 extends CompositeElement {
    public E5495 e5495;
    public E1082 e1082;


    public C829() {
        this(false, null, null);
    }


    public C829(Boolean Mandatory, String s5495, String s1082) {
        super("C829", "SUB-LINE INFORMATION", "To provide an indication that a segment or segment group is used to contain sub-line or sub-line item information and to optionally enable the sub-line to be identified.");
        this.setMandatory(Mandatory);
        e5495 = new E5495();
        e1082 = new E1082();
        e5495.setContent(s5495);
        e1082.setContent(s1082);
        addElement(e5495);
        addElement(e1082);
    }


}

