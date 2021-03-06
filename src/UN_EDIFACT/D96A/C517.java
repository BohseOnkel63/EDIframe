package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C517 extends CompositeElement {
    public E3225 e3225;
    public E1131 e1131;
    public E3055 e3055;
    public E3224 e3224;


    public C517() {
        this(false, null, null, null, null);
    }


    public C517(Boolean Mandatory, String s3225, String s1131, String s3055, String s3224) {
        super("C517", "LOCATION IDENTIFICATION", "Identification of a location by code or name.");
        this.setMandatory(Mandatory);
        e3225 = new E3225();
        e1131 = new E1131();
        e3055 = new E3055();
        e3224 = new E3224();
        e3225.setContent(s3225);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3224.setContent(s3224);
        addElement(e3225);
        addElement(e1131);
        addElement(e3055);
        addElement(e3224);
    }


}

