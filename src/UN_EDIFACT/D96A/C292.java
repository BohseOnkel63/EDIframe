package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C292 extends CompositeElement {
    public E5377 e5377;
    public E1131 e1131;
    public E3055 e3055;


    public C292() {
        this(false, null, null, null);
    }


    public C292(Boolean Mandatory, String s5377, String s1131, String s3055) {
        super("C292", "PRICE CHANGE INFORMATION", "A value assigned by the seller to indicate movement of prices from a previous price catalogue.");
        this.setMandatory(Mandatory);
        e5377 = new E5377();
        e1131 = new E1131();
        e3055 = new E3055();
        e5377.setContent(s5377);
        e5377.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5377);
        addElement(e1131);
        addElement(e3055);
    }


}

