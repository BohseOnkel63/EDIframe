package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C042 extends CompositeElement {
    public E3293 e3293 = new E3293();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3292 e3292 = new E3292();


    public C042() {
        this(false, null, null, null, null);
    }


    public C042(Boolean Mandatory, String s3293, String s1131, String s3055, String s3292) {
        super("C042", "NATIONALITY DETAILS", "To specify a nationality.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3293, e1131, e3055, e3292}));
        e3293.setContent(s3293);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3292.setContent(s3292);
    }


}

