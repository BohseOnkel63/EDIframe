package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C529 extends CompositeElement {
    public E7365 e7365 = new E7365();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7187 e7187 = new E7187();


    public C529() {
        this(false, null, null, null, null);
    }


    public C529(Boolean Mandatory, String s7365, String s1131, String s3055, String s7187) {
        super("C529", "PROCESSING INDICATOR", "Type of process indication.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7365, e1131, e3055, e7187}));
        e7365.setContent(s7365);
        e7365.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7187.setContent(s7187);
    }


}

