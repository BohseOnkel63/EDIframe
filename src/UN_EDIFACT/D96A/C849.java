package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C849 extends CompositeElement {
    public E3301 e3301;
    public E3285 e3285;


    public C849() {
        this(false, null, null);
    }


    public C849(Boolean Mandatory, String s3301, String s3285) {
        super("C849", "PARTIES TO INSTRUCTION", "Identify the sending and receiving parties of the instruction.");
        this.setMandatory(Mandatory);
        e3301 = new E3301();
        e3285 = new E3285();
        e3301.setContent(s3301);
        e3301.setMandatory(true);
        e3285.setContent(s3285);
        addElement(e3301);
        addElement(e3285);
    }


}

