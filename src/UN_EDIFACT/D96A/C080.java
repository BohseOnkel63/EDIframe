package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C080 extends CompositeElement {
    public E3036 e3036_1;
    public E3036 e3036_2;
    public E3036 e3036_3;
    public E3036 e3036_4;
    public E3036 e3036_5;
    public E3045 e3045;


    public C080() {
        this(false, null, null, null, null, null, null);
    }


    public C080(Boolean Mandatory, String s3036_1, String s3036_2, String s3036_3, String s3036_4, String s3036_5, String s3045) {
        super("C080", "PARTY NAME", "Identification of a transaction party by name, one to five lines. Party name may be formatted.");
        this.setMandatory(Mandatory);
        e3036_1 = new E3036();
        e3036_2 = new E3036();
        e3036_3 = new E3036();
        e3036_4 = new E3036();
        e3036_5 = new E3036();
        e3045 = new E3045();
        e3036_1.setContent(s3036_1);
        e3036_1.setMandatory(true);
        e3036_2.setContent(s3036_2);
        e3036_3.setContent(s3036_3);
        e3036_4.setContent(s3036_4);
        e3036_5.setContent(s3036_5);
        e3045.setContent(s3045);
        addElement(e3036_1);
        addElement(e3036_2);
        addElement(e3036_3);
        addElement(e3036_4);
        addElement(e3036_5);
        addElement(e3045);
    }


}

