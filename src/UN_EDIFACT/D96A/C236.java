package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C236 extends CompositeElement {
    public E8246 e8246_1;
    public E8246 e8246_2;
    public E8246 e8246_3;


    public C236() {
        this(false, null, null, null);
    }


    public C236(Boolean Mandatory, String s8246_1, String s8246_2, String s8246_3) {
        super("C236", "DANGEROUS GOODS LABEL", "Markings identifying the type of hazardous goods and similar information.");
        this.setMandatory(Mandatory);
        e8246_1 = new E8246();
        e8246_2 = new E8246();
        e8246_3 = new E8246();
        e8246_1.setContent(s8246_1);
        e8246_2.setContent(s8246_2);
        e8246_3.setContent(s8246_3);
        addElement(e8246_1);
        addElement(e8246_2);
        addElement(e8246_3);
    }


}

