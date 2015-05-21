package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C100 extends CompositeElement {
    public E4053 e4053 = new E4053();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4052 e4052_1 = new E4052();
    public E4052 e4052_2 = new E4052();


    public C100() {
        this(false, null, null, null, null, null);
    }


    public C100(Boolean Mandatory, String s4053, String s1131, String s3055, String s4052_1, String s4052_2) {
        super("C100", "TERMS OF DELIVERY OR TRANSPORT", "Terms of delivery or transport code from a specified source.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4053, e1131, e3055, e4052_1, e4052_2}));
        e4053.setContent(s4053);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4052_1.setContent(s4052_1);
        e4052_2.setContent(s4052_2);
    }


}

