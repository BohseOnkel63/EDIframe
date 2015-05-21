package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C948 extends CompositeElement {
    public E9005 e9005 = new E9005();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9004 e9004 = new E9004();


    public C948() {
        this(false, null, null, null, null);
    }


    public C948(Boolean Mandatory, String s9005, String s1131, String s3055, String s9004) {
        super("C948", "EMPLOYMENT CATEGORY", "Code and/or description of an employment category.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9005, e1131, e3055, e9004}));
        e9005.setContent(s9005);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9004.setContent(s9004);
    }


}

