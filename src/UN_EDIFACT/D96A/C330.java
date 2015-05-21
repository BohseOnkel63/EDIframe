package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C330 extends CompositeElement {
    public E4497 e4497 = new E4497();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C330() {
        this(false, null, null, null);
    }


    public C330(Boolean Mandatory, String s4497, String s1131, String s3055) {
        super("C330", "INSURANCE COVER TYPE", "To provide the insurance cover type.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4497, e1131, e3055}));
        e4497.setContent(s4497);
        e4497.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

