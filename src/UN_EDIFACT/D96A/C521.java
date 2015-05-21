package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C521 extends CompositeElement {
    public E4027 e4027 = new E4027();
    public E4025 e4025 = new E4025();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4022 e4022 = new E4022();


    public C521() {
        this(false, null, null, null, null, null);
    }


    public C521(Boolean Mandatory, String s4027, String s4025, String s1131, String s3055, String s4022) {
        super("C521", "BUSINESS FUNCTION", "To specify a business reason.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4027, e4025, e1131, e3055, e4022}));
        e4027.setContent(s4027);
        e4027.setMandatory(true);
        e4025.setContent(s4025);
        e4025.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4022.setContent(s4022);
    }


}

