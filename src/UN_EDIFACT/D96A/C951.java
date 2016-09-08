package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C951 extends CompositeElement {
    public E9009 e9009;
    public E1131 e1131;
    public E3055 e3055;
    public E9008 e9008_1;
    public E9008 e9008_2;


    public C951() {
        this(false, null, null, null, null, null);
    }


    public C951(Boolean Mandatory, String s9009, String s1131, String s3055, String s9008_1, String s9008_2) {
        super("C951", "OCCUPATION", "Description of an occupation.");
        this.setMandatory(Mandatory);
        e9009 = new E9009();
        e1131 = new E1131();
        e3055 = new E3055();
        e9008_1 = new E9008();
        e9008_2 = new E9008();
        e9009.setContent(s9009);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9008_1.setContent(s9008_1);
        e9008_2.setContent(s9008_2);
        addElement(e9009);
        addElement(e1131);
        addElement(e3055);
        addElement(e9008_1);
        addElement(e9008_2);
    }


}

