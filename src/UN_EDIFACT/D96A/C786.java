package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C786 extends CompositeElement {
    public E7512 e7512 = new E7512();
    public E7405 e7405 = new E7405();


    public C786() {
        this(false, null, null);
    }


    public C786(Boolean Mandatory, String s7512, String s7405) {
        super("C786", "STRUCTURE COMPONENT IDENTIFICATION", "The identification of a structure component.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7512, e7405}));
        e7512.setContent(s7512);
        e7512.setMandatory(true);
        e7405.setContent(s7405);
    }


}

