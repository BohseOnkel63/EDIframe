package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C208 extends CompositeElement {
    public E7402 e7402_1;
    public E7402 e7402_2;


    public C208() {
        this(false, null, null);
    }


    public C208(Boolean Mandatory, String s7402_1, String s7402_2) {
        super("C208", "IDENTITY NUMBER RANGE", "Goods item identification numbers, start and end of consecutively numbered range.");
        this.setMandatory(Mandatory);
        e7402_1 = new E7402();
        e7402_2 = new E7402();
        e7402_1.setContent(s7402_1);
        e7402_1.setMandatory(true);
        e7402_2.setContent(s7402_2);
        addElement(e7402_1);
        addElement(e7402_2);
    }


}

