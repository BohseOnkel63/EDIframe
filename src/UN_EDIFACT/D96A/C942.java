package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C942 extends CompositeElement {
    public E7451 e7451 = new E7451();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7450 e7450 = new E7450();


    public C942() {
        this(false, null, null, null, null);
    }


    public C942(Boolean Mandatory, String s7451, String s1131, String s3055, String s7450) {
        super("C942", "MEMBERSHIP CATEGORY", "Identification and/or description of a membership category for a member of a scheme or group.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7451, e1131, e3055, e7450}));
        e7451.setContent(s7451);
        e7451.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7450.setContent(s7450);
    }


}

