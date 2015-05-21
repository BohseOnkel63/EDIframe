package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C889 extends CompositeElement {
    public E7111 e7111 = new E7111();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7110 e7110_1 = new E7110();
    public E7110 e7110_2 = new E7110();


    public C889() {
        this(false, null, null, null, null, null);
    }


    public C889(Boolean Mandatory, String s7111, String s1131, String s3055, String s7110_1, String s7110_2) {
        super("C889", "CHARACTERISTIC VALUE", "To provide the value of a characteristic.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7111, e1131, e3055, e7110_1, e7110_2}));
        e7111.setContent(s7111);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7110_1.setContent(s7110_1);
        e7110_2.setContent(s7110_2);
    }


}

