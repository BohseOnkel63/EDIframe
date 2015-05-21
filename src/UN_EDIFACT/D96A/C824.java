package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C824 extends CompositeElement {
    public E7507 e7507 = new E7507();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7506 e7506 = new E7506();


    public C824() {
        this(false, null, null, null, null);
    }


    public C824(Boolean Mandatory, String s7507, String s1131, String s3055, String s7506) {
        super("C824", "COMPONENT MATERIAL", "To identify the material of which a component is composed (e.g. steel, plastics).");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7507, e1131, e3055, e7506}));
        e7507.setContent(s7507);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7506.setContent(s7506);
    }


}

