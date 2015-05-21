package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C206 extends CompositeElement {
    public E7402 e7402 = new E7402();
    public E7405 e7405 = new E7405();
    public E4405 e4405 = new E4405();


    public C206() {
        this(false, null, null, null);
    }


    public C206(Boolean Mandatory, String s7402, String s7405, String s4405) {
        super("C206", "IDENTIFICATION NUMBER", "The identification of an object.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7402, e7405, e4405}));
        e7402.setContent(s7402);
        e7402.setMandatory(true);
        e7405.setContent(s7405);
        e4405.setContent(s4405);
    }


}

