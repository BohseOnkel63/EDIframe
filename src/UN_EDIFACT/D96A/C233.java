package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C233 extends CompositeElement {
    public E7273 e7273 = new E7273();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7273 e7273_1 = new E7273();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();


    public C233() {
        this(false, null, null, null, null, null, null);
    }


    public C233(Boolean Mandatory, String s7273, String s1131, String s3055, String s7273_1, String s1131_1, String s3055_1) {
        super("C233", "SERVICE", "To identify a service (which may constitute an additional component to a basic contract).");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7273, e1131, e3055, e7273_1, e1131_1, e3055_1}));
        e7273.setContent(s7273);
        e7273.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7273_1.setContent(s7273_1);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
    }


}

