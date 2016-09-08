package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C243 extends CompositeElement {
    public E5279 e5279;
    public E1131 e1131;
    public E3055 e3055;
    public E5278 e5278;
    public E5273 e5273;
    public E1131 e1131_1;
    public E3055 e3055_1;


    public C243() {
        this(false, null, null, null, null, null, null, null);
    }


    public C243(Boolean Mandatory, String s5279, String s1131, String s3055, String s5278, String s5273, String s1131_1, String s3055_1) {
        super("C243", "DUTY/TAX/FEE DETAIL", "Rate of duty/tax/fee applicable to commodities or of tax applicable to services.");
        this.setMandatory(Mandatory);
        e5279 = new E5279();
        e1131 = new E1131();
        e3055 = new E3055();
        e5278 = new E5278();
        e5273 = new E5273();
        e1131_1 = new E1131();
        e3055_1 = new E3055();
        e5279.setContent(s5279);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5278.setContent(s5278);
        e5273.setContent(s5273);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        addElement(e5279);
        addElement(e1131);
        addElement(e3055);
        addElement(e5278);
        addElement(e5273);
        addElement(e1131_1);
        addElement(e3055_1);
    }


}

