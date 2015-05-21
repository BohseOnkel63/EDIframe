package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C082 extends CompositeElement {
    public E3039 e3039 = new E3039();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C082() {
        this(false, null, null, null);
    }


    public C082(Boolean Mandatory, String s3039, String s1131, String s3055) {
        super("C082", "PARTY IDENTIFICATION DETAILS", "Identification of a transaction party by code.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3039, e1131, e3055}));
        e3039.setContent(s3039);
        e3039.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

