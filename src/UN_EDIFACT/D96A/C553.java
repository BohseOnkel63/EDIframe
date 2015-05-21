package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C553 extends CompositeElement {
    public E3233 e3233 = new E3233();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3232 e3232 = new E3232();


    public C553() {
        this(false, null, null, null, null);
    }


    public C553(Boolean Mandatory, String s3233, String s1131, String s3055, String s3232) {
        super("C553", "RELATED LOCATION TWO IDENTIFICATION", "Identification of second related location by code or name.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3233, e1131, e3055, e3232}));
        e3233.setContent(s3233);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3232.setContent(s3232);
    }


}

