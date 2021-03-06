package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C224 extends CompositeElement {
    public E8155 e8155;
    public E1131 e1131;
    public E3055 e3055;
    public E8154 e8154;


    public C224() {
        this(false, null, null, null, null);
    }


    public C224(Boolean Mandatory, String s8155, String s1131, String s3055, String s8154) {
        super("C224", "EQUIPMENT SIZE AND TYPE", "Code and/or name identifying size and type of equipment used in transport. Code preferred.");
        this.setMandatory(Mandatory);
        e8155 = new E8155();
        e1131 = new E1131();
        e3055 = new E3055();
        e8154 = new E8154();
        e8155.setContent(s8155);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8154.setContent(s8154);
        addElement(e8155);
        addElement(e1131);
        addElement(e3055);
        addElement(e8154);
    }


}

