package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C779 extends CompositeElement {
    public E9428 e9428 = new E9428();
    public E7405 e7405 = new E7405();


    public C779() {
        this(false, null, null);
    }


    public C779(Boolean Mandatory, String s9428, String s7405) {
        super("C779", "ARRAY STRUCTURE IDENTIFICATION", "The identification of an array structure.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9428, e7405}));
        e9428.setContent(s9428);
        e9428.setMandatory(true);
        e7405.setContent(s7405);
    }


}

