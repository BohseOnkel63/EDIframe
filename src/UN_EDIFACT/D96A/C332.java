package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C332 extends CompositeElement {
    public E3496 e3496;
    public E1131 e1131;
    public E3055 e3055;


    public C332() {
        this(false, null, null, null);
    }


    public C332(Boolean Mandatory, String s3496, String s1131, String s3055) {
        super("C332", "SALES CHANNEL IDENTIFICATION", "Identification of sales channel for marketing data, sales, forecast, planning...");
        this.setMandatory(Mandatory);
        e3496 = new E3496();
        e1131 = new E1131();
        e3055 = new E3055();
        e3496.setContent(s3496);
        e3496.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e3496);
        addElement(e1131);
        addElement(e3055);
    }


}

