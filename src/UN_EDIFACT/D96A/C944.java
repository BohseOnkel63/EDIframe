package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C944 extends CompositeElement {
    public E7453 e7453 = new E7453();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7452 e7452 = new E7452();


    public C944() {
        this(false, null, null, null, null);
    }


    public C944(Boolean Mandatory, String s7453, String s1131, String s3055, String s7452) {
        super("C944", "MEMBERSHIP STATUS", "Code and/or description of membership status.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7453, e1131, e3055, e7452}));
        e7453.setContent(s7453);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7452.setContent(s7452);
    }


}

