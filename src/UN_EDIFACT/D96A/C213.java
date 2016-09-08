package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C213 extends CompositeElement {
    public E7224 e7224;
    public E7065 e7065;
    public E1131 e1131;
    public E3055 e3055;
    public E7064 e7064;


    public C213() {
        this(false, null, null, null, null, null);
    }


    public C213(Boolean Mandatory, String s7224, String s7065, String s1131, String s3055, String s7064) {
        super("C213", "NUMBER AND TYPE OF PACKAGES", "Number and type of individual parts of a shipment.");
        this.setMandatory(Mandatory);
        e7224 = new E7224();
        e7065 = new E7065();
        e1131 = new E1131();
        e3055 = new E3055();
        e7064 = new E7064();
        e7224.setContent(s7224);
        e7065.setContent(s7065);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7064.setContent(s7064);
        addElement(e7224);
        addElement(e7065);
        addElement(e1131);
        addElement(e3055);
        addElement(e7064);
    }


}

