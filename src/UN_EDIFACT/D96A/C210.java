package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C210 extends CompositeElement {
    public E7102 e7102_1;
    public E7102 e7102_2;
    public E7102 e7102_3;
    public E7102 e7102_4;
    public E7102 e7102_5;
    public E7102 e7102_6;
    public E7102 e7102_7;
    public E7102 e7102_8;
    public E7102 e7102_9;
    public E7102 e7102_10;


    public C210() {
        this(false, null, null, null, null, null, null, null, null, null, null);
    }


    public C210(Boolean Mandatory, String s7102_1, String s7102_2, String s7102_3, String s7102_4, String s7102_5, String s7102_6, String s7102_7, String s7102_8, String s7102_9, String s7102_10) {
        super("C210", "MARKS & LABELS", "Shipping marks on packages in free text; one to ten lines.");
        this.setMandatory(Mandatory);
        e7102_1 = new E7102();
        e7102_2 = new E7102();
        e7102_3 = new E7102();
        e7102_4 = new E7102();
        e7102_5 = new E7102();
        e7102_6 = new E7102();
        e7102_7 = new E7102();
        e7102_8 = new E7102();
        e7102_9 = new E7102();
        e7102_10 = new E7102();
        e7102_1.setContent(s7102_1);
        e7102_1.setMandatory(true);
        e7102_2.setContent(s7102_2);
        e7102_3.setContent(s7102_3);
        e7102_4.setContent(s7102_4);
        e7102_5.setContent(s7102_5);
        e7102_6.setContent(s7102_6);
        e7102_7.setContent(s7102_7);
        e7102_8.setContent(s7102_8);
        e7102_9.setContent(s7102_9);
        e7102_10.setContent(s7102_10);
        addElement(e7102_1);
        addElement(e7102_2);
        addElement(e7102_3);
        addElement(e7102_4);
        addElement(e7102_5);
        addElement(e7102_6);
        addElement(e7102_7);
        addElement(e7102_8);
        addElement(e7102_9);
        addElement(e7102_10);
    }


}

