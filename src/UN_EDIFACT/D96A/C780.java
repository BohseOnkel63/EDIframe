package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C780 extends CompositeElement {
    public E1518 e1518 = new E1518();
    public E7405 e7405 = new E7405();


    public C780() {
        this(false, null, null);
    }


    public C780(Boolean Mandatory, String s1518, String s7405) {
        super("C780", "VALUE LIST IDENTIFICATION", "The identification of a coded or non coded value list.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1518, e7405}));
        e1518.setContent(s1518);
        e1518.setMandatory(true);
        e7405.setContent(s7405);
    }


}

