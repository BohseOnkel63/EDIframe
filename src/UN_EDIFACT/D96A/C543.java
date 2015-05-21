package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C543 extends CompositeElement {
    public E7431 e7431 = new E7431();
    public E7433 e7433 = new E7433();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7434 e7434 = new E7434();


    public C543() {
        this(false, null, null, null, null, null);
    }


    public C543(Boolean Mandatory, String s7431, String s7433, String s1131, String s3055, String s7434) {
        super("C543", "AGREEMENT TYPE IDENTIFICATION", "Identification of specific agreement type by code or name.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7431, e7433, e1131, e3055, e7434}));
        e7431.setContent(s7431);
        e7431.setMandatory(true);
        e7433.setContent(s7433);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7434.setContent(s7434);
    }


}

