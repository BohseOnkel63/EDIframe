package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C519 extends CompositeElement {
    public E3223 e3223 = new E3223();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3222 e3222 = new E3222();


    public C519() {
        this(false, null, null, null, null);
    }


    public C519(Boolean Mandatory, String s3223, String s1131, String s3055, String s3222) {
        super("C519", "RELATED LOCATION ONE IDENTIFICATION", "Identification the first related location by code or name.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3223, e1131, e3055, e3222}));
        e3223.setContent(s3223);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3222.setContent(s3222);
    }


}

