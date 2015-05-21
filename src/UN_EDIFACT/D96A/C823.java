package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C823 extends CompositeElement {
    public E7505 e7505 = new E7505();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7504 e7504 = new E7504();


    public C823() {
        this(false, null, null, null, null);
    }


    public C823(Boolean Mandatory, String s7505, String s1131, String s3055, String s7504) {
        super("C823", "TYPE OF UNIT/COMPONENT", "To identify the type of unit/component of an object (e.g. lock, door, tyre).");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7505, e1131, e3055, e7504}));
        e7505.setContent(s7505);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7504.setContent(s7504);
    }


}

