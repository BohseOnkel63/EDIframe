package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C953 extends CompositeElement {
    public E5049 e5049;
    public E1131 e1131;
    public E3055 e3055;
    public E5048 e5048;


    public C953() {
        this(false, null, null, null, null);
    }


    public C953(Boolean Mandatory, String s5049, String s1131, String s3055, String s5048) {
        super("C953", "CONTRIBUTION TYPE", "Identification of the type of a contribution to a scheme or group.");
        this.setMandatory(Mandatory);
        e5049 = new E5049();
        e1131 = new E1131();
        e3055 = new E3055();
        e5048 = new E5048();
        e5049.setContent(s5049);
        e5049.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5048.setContent(s5048);
        addElement(e5049);
        addElement(e1131);
        addElement(e3055);
        addElement(e5048);
    }


}

