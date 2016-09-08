package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C279 extends CompositeElement {
    public E6064 e6064;
    public E6063 e6063;


    public C279() {
        this(false, null, null);
    }


    public C279(Boolean Mandatory, String s6064, String s6063) {
        super("C279", "QUANTITY DIFFERENCE INFORMATION", "Information on quantity difference.");
        this.setMandatory(Mandatory);
        e6064 = new E6064();
        e6063 = new E6063();
        e6064.setContent(s6064);
        e6064.setMandatory(true);
        e6063.setContent(s6063);
        addElement(e6064);
        addElement(e6063);
    }


}

