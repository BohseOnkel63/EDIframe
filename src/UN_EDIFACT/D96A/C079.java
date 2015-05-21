package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C079 extends CompositeElement {
    public E1511 e1511 = new E1511();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E1510 e1510 = new E1510();
    public E1056 e1056 = new E1056();
    public E1058 e1058 = new E1058();
    public E7402 e7402 = new E7402();


    public C079() {
        this(false, null, null, null, null, null, null, null);
    }


    public C079(Boolean Mandatory, String s1511, String s1131, String s3055, String s1510, String s1056, String s1058, String s7402) {
        super("C079", "COMPUTER ENVIRONMENT IDENTIFICATION", "To identify parts of a computer environment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1511, e1131, e3055, e1510, e1056, e1058, e7402}));
        e1511.setContent(s1511);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e1510.setContent(s1510);
        e1056.setContent(s1056);
        e1058.setContent(s1058);
        e7402.setContent(s7402);
    }


}

