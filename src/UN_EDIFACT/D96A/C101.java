package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C101 extends CompositeElement {
    public E3483 e3483 = new E3483();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3482 e3482 = new E3482();


    public C101() {
        this(false, null, null, null, null);
    }


    public C101(Boolean Mandatory, String s3483, String s1131, String s3055, String s3482) {
        super("C101", "RELIGION DETAILS", "To specify the religion of a person.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3483, e1131, e3055, e3482}));
        e3483.setContent(s3483);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3482.setContent(s3482);
    }


}

