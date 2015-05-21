package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C049 extends CompositeElement {
    public E5315 e5315 = new E5315();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5314 e5314_1 = new E5314();
    public E5314 e5314_2 = new E5314();


    public C049() {
        this(false, null, null, null, null, null);
    }


    public C049(Boolean Mandatory, String s5315, String s1131, String s3055, String s5314_1, String s5314_2) {
        super("C049", "REMUNERATION TYPE IDENTIFICATION", "Identification of the type of a remuneration.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5315, e1131, e3055, e5314_1, e5314_2}));
        e5315.setContent(s5315);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5314_1.setContent(s5314_1);
        e5314_2.setContent(s5314_2);
    }


}

