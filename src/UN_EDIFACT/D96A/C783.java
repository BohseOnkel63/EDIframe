package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C783 extends CompositeElement {
    public E9430 e9430 = new E9430();
    public E7405 e7405 = new E7405();


    public C783() {
        this(false, null, null);
    }


    public C783(Boolean Mandatory, String s9430, String s7405) {
        super("C783", "FOOTNOTE SET IDENTIFICATION", "The identification of a set of footnotes.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9430, e7405}));
        e9430.setContent(s9430);
        e9430.setMandatory(true);
        e7405.setContent(s7405);
    }


}

