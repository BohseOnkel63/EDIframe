package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C532 extends CompositeElement {
    public E8395 e8395 = new E8395();
    public E8393 e8393 = new E8393();


    public C532() {
        this(false, null, null);
    }


    public C532(Boolean Mandatory, String s8395, String s8393) {
        super("C532", "RETURNABLE PACKAGE DETAILS", "Indication of responsibility for payment and load contents of returnable packages.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8395, e8393}));
        e8395.setContent(s8395);
        e8393.setContent(s8393);
    }


}

