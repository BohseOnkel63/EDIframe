package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C246 extends CompositeElement {
    public E7361 e7361 = new E7361();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C246() {
        this(false, null, null, null);
    }


    public C246(Boolean Mandatory, String s7361, String s1131, String s3055) {
        super("C246", "CUSTOMS IDENTITY CODES", "Specification of goods in terms of customs identity.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7361, e1131, e3055}));
        e7361.setContent(s7361);
        e7361.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

