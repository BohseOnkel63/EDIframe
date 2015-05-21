package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C941 extends CompositeElement {
    public E9143 e9143 = new E9143();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9142 e9142 = new E9142();


    public C941() {
        this(false, null, null, null, null);
    }


    public C941(Boolean Mandatory, String s9143, String s1131, String s3055, String s9142) {
        super("C941", "RELATIONSHIP", "Identification and/or description of a relationship.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9143, e1131, e3055, e9142}));
        e9143.setContent(s9143);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9142.setContent(s9142);
    }


}

