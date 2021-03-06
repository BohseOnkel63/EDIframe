package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C273 extends CompositeElement {
    public E7009 e7009;
    public E1131 e1131;
    public E3055 e3055;
    public E7008 e7008_1;
    public E7008 e7008_2;
    public E3453 e3453;


    public C273() {
        this(false, null, null, null, null, null, null);
    }


    public C273(Boolean Mandatory, String s7009, String s1131, String s3055, String s7008_1, String s7008_2, String s3453) {
        super("C273", "ITEM DESCRIPTION", "Description of an item.");
        this.setMandatory(Mandatory);
        e7009 = new E7009();
        e1131 = new E1131();
        e3055 = new E3055();
        e7008_1 = new E7008();
        e7008_2 = new E7008();
        e3453 = new E3453();
        e7009.setContent(s7009);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7008_1.setContent(s7008_1);
        e7008_2.setContent(s7008_2);
        e3453.setContent(s3453);
        addElement(e7009);
        addElement(e1131);
        addElement(e3055);
        addElement(e7008_1);
        addElement(e7008_2);
        addElement(e3453);
    }


}

