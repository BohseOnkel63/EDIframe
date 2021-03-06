package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C814 extends CompositeElement {
    public E4046 e4046;
    public E4044 e4044;


    public C814() {
        this(false, null, null);
    }


    public C814(Boolean Mandatory, String s4046, String s4044) {
        super("C814", "SAFETY SECTION", "To identify the safety section to which information relates.");
        this.setMandatory(Mandatory);
        e4046 = new E4046();
        e4044 = new E4044();
        e4046.setContent(s4046);
        e4046.setMandatory(true);
        e4044.setContent(s4044);
        addElement(e4046);
        addElement(e4044);
    }


}

