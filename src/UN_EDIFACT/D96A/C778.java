package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C778 extends CompositeElement {
    public E7164 e7164 = new E7164();
    public E1050 e1050 = new E1050();


    public C778() {
        this(false, null, null);
    }


    public C778(Boolean Mandatory, String s7164, String s1050) {
        super("C778", "POSITION IDENTIFICATION", "To identify the position of an object in a structure containing the object.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7164, e1050}));
        e7164.setContent(s7164);
        e1050.setContent(s1050);
    }


}

