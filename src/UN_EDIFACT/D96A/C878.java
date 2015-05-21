package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C878 extends CompositeElement {
    public E3434 e3434 = new E3434();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3194 e3194 = new E3194();
    public E6345 e6345 = new E6345();


    public C878() {
        this(false, null, null, null, null, null);
    }


    public C878(Boolean Mandatory, String s3434, String s1131, String s3055, String s3194, String s6345) {
        super("C878", "CHARGE/ALLOWANCE ACCOUNT", "Identification of the account for charge or allowance.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3434, e1131, e3055, e3194, e6345}));
        e3434.setContent(s3434);
        e3434.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3194.setContent(s3194);
        e6345.setContent(s6345);
    }


}

