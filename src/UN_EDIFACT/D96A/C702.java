package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C702 extends CompositeElement {
    public E9150 e9150 = new E9150();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C702() {
        this(false, null, null, null);
    }


    public C702(Boolean Mandatory, String s9150, String s1131, String s3055) {
        super("C702", "CODE SET IDENTIFICATION", "To identify a code set.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9150, e1131, e3055}));
        e9150.setContent(s9150);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

