package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C703 extends CompositeElement {
    public E7085 e7085 = new E7085();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C703() {
        this(false, null, null, null);
    }


    public C703(Boolean Mandatory, String s7085, String s1131, String s3055) {
        super("C703", "NATURE OF CARGO", "Rough classification of a type of cargo.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7085, e1131, e3055}));
        e7085.setContent(s7085);
        e7085.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

