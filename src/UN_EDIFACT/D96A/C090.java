package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C090 extends CompositeElement {
    public E3477 e3477;
    public E3286 e3286_1;
    public E3286 e3286_2;
    public E3286 e3286_3;
    public E3286 e3286_4;
    public E3286 e3286_5;


    public C090() {
        this(false, null, null, null, null, null, null);
    }


    public C090(Boolean Mandatory, String s3477, String s3286_1, String s3286_2, String s3286_3, String s3286_4, String s3286_5) {
        super("C090", "ADDRESS DETAILS", "To specify the details of an address.");
        this.setMandatory(Mandatory);
        e3477 = new E3477();
        e3286_1 = new E3286();
        e3286_2 = new E3286();
        e3286_3 = new E3286();
        e3286_4 = new E3286();
        e3286_5 = new E3286();
        e3477.setContent(s3477);
        e3477.setMandatory(true);
        e3286_1.setContent(s3286_1);
        e3286_1.setMandatory(true);
        e3286_2.setContent(s3286_2);
        e3286_3.setContent(s3286_3);
        e3286_4.setContent(s3286_4);
        e3286_5.setContent(s3286_5);
        addElement(e3477);
        addElement(e3286_1);
        addElement(e3286_2);
        addElement(e3286_3);
        addElement(e3286_4);
        addElement(e3286_5);
    }


}

