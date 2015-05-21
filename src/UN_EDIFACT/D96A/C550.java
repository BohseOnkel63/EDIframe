package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C550 extends CompositeElement {
    public E7295 e7295 = new E7295();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7294 e7294 = new E7294();


    public C550() {
        this(false, null, null, null, null);
    }


    public C550(Boolean Mandatory, String s7295, String s1131, String s3055, String s7294) {
        super("C550", "REQUIREMENT/CONDITION IDENTIFICATION", "To identify the specific rule/condition requirement.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7295, e1131, e3055, e7294}));
        e7295.setContent(s7295);
        e7295.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7294.setContent(s7294);
    }


}

