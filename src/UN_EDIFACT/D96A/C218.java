package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C218 extends CompositeElement {
    public E7419 e7419 = new E7419();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C218() {
        this(false, null, null, null);
    }


    public C218(Boolean Mandatory, String s7419, String s1131, String s3055) {
        super("C218", "HAZARDOUS MATERIAL", "Hazardous material code from a specified source.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7419, e1131, e3055}));
        e7419.setContent(s7419);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

