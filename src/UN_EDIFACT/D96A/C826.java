package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C826 extends CompositeElement {
    public E1229 e1229 = new E1229();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E1228 e1228 = new E1228();


    public C826() {
        this(false, null, null, null, null);
    }


    public C826(Boolean Mandatory, String s1229, String s1131, String s3055, String s1228) {
        super("C826", "ACTION", "To indicate an action which has been taken or is to be taken (e.g. in relation to a certain object).");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1229, e1131, e3055, e1228}));
        e1229.setContent(s1229);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1228.setContent(s1228);
    }


}

