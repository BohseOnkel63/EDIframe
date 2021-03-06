package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C533 extends CompositeElement {
    public E5289 e5289;
    public E1131 e1131;
    public E3055 e3055;


    public C533() {
        this(false, null, null, null);
    }


    public C533(Boolean Mandatory, String s5289, String s1131, String s3055) {
        super("C533", "DUTY/TAX/FEE ACCOUNT DETAIL", "Indication of account reference for duties, taxes and/or fees.");
        this.setMandatory(Mandatory);
        e5289 = new E5289();
        e1131 = new E1131();
        e3055 = new E3055();
        e5289.setContent(s5289);
        e5289.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        addElement(e5289);
        addElement(e1131);
        addElement(e3055);
    }


}

