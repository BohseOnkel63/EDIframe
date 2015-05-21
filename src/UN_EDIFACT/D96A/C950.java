package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C950 extends CompositeElement {
    public E9007 e9007 = new E9007();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9006 e9006_1 = new E9006();
    public E9006 e9006_2 = new E9006();


    public C950() {
        this(false, null, null, null, null, null);
    }


    public C950(Boolean Mandatory, String s9007, String s1131, String s3055, String s9006_1, String s9006_2) {
        super("C950", "QUALIFICATION CLASSIFICATION", "Qualification classification description and/or code. This specifies the trade, skill, professional or similar qualification category.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9007, e1131, e3055, e9006_1, e9006_2}));
        e9007.setContent(s9007);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9006_1.setContent(s9006_1);
        e9006_2.setContent(s9006_2);
    }


}

