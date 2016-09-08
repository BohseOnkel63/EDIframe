package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C138 extends CompositeElement {
    public E5394 e5394;
    public E5393 e5393;


    public C138() {
        this(false, null, null);
    }


    public C138(Boolean Mandatory, String s5394, String s5393) {
        super("C138", "PRICE MULTIPLIER INFORMATION", "Price multiplier and its identification.");
        this.setMandatory(Mandatory);
        e5394 = new E5394();
        e5393 = new E5393();
        e5394.setContent(s5394);
        e5394.setMandatory(true);
        e5393.setContent(s5393);
        addElement(e5394);
        addElement(e5393);
    }


}

