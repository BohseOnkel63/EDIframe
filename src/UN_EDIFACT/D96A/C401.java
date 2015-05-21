package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C401 extends CompositeElement {
    public E8457 e8457 = new E8457();
    public E8459 e8459 = new E8459();
    public E7130 e7130 = new E7130();


    public C401() {
        this(false, null, null, null);
    }


    public C401(Boolean Mandatory, String s8457, String s8459, String s7130) {
        super("C401", "EXCESS TRANSPORTATION INFORMATION", "To provide details of reason for, and responsibility for, use of transportation other than normally utilized.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8457, e8459, e7130}));
        e8457.setContent(s8457);
        e8457.setMandatory(true);
        e8459.setContent(s8459);
        e8459.setMandatory(true);
        e7130.setContent(s7130);
    }


}

