package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C956 extends CompositeElement {
    public E9019 e9019;
    public E1131 e1131;
    public E3055 e3055;
    public E9018 e9018;


    public C956() {
        this(false, null, null, null, null);
    }


    public C956(Boolean Mandatory, String s9019, String s1131, String s3055, String s9018) {
        super("C956", "ATTRIBUTE DETAILS", "Identification of the attribute related to an entity.");
        this.setMandatory(Mandatory);
        e9019 = new E9019();
        e1131 = new E1131();
        e3055 = new E3055();
        e9018 = new E9018();
        e9019.setContent(s9019);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9018.setContent(s9018);
        addElement(e9019);
        addElement(e1131);
        addElement(e3055);
        addElement(e9018);
    }


}

