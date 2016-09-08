package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C040 extends CompositeElement {
    public E3127 e3127;
    public E1131 e1131;
    public E3055 e3055;
    public E3128 e3128;


    public C040() {
        this(false, null, null, null, null);
    }


    public C040(Boolean Mandatory, String s3127, String s1131, String s3055, String s3128) {
        super("C040", "CARRIER", "Identification of a carrier by code and/or by name. Code preferred.");
        this.setMandatory(Mandatory);
        e3127 = new E3127();
        e1131 = new E1131();
        e3055 = new E3055();
        e3128 = new E3128();
        e3127.setContent(s3127);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3128.setContent(s3128);
        addElement(e3127);
        addElement(e1131);
        addElement(e3055);
        addElement(e3128);
    }


}

