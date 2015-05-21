package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C215 extends CompositeElement {
    public E9303 e9303 = new E9303();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9302 e9302 = new E9302();


    public C215() {
        this(false, null, null, null, null);
    }


    public C215(Boolean Mandatory, String s9303, String s1131, String s3055, String s9302) {
        super("C215", "SEAL ISSUER", "Identification of the issuer of a seal on equipment either by code or by name.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9303, e1131, e3055, e9302}));
        e9303.setContent(s9303);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9302.setContent(s9302);
    }


}

