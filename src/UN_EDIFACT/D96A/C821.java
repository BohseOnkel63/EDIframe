package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C821 extends CompositeElement {
    public E7501 e7501;
    public E1131 e1131;
    public E3055 e3055;
    public E7500 e7500;


    public C821() {
        this(false, null, null, null, null);
    }


    public C821(Boolean Mandatory, String s7501, String s1131, String s3055, String s7500) {
        super("C821", "TYPE OF DAMAGE", "To specify the type of damage to an object.");
        this.setMandatory(Mandatory);
        e7501 = new E7501();
        e1131 = new E1131();
        e3055 = new E3055();
        e7500 = new E7500();
        e7501.setContent(s7501);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7500.setContent(s7500);
        addElement(e7501);
        addElement(e1131);
        addElement(e3055);
        addElement(e7500);
    }


}

