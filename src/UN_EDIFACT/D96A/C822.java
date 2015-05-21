package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C822 extends CompositeElement {
    public E7503 e7503 = new E7503();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7502 e7502 = new E7502();


    public C822() {
        this(false, null, null, null, null);
    }


    public C822(Boolean Mandatory, String s7503, String s1131, String s3055, String s7502) {
        super("C822", "DAMAGE AREA", "To specify where the damage is on an object.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7503, e1131, e3055, e7502}));
        e7503.setContent(s7503);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7502.setContent(s7502);
    }


}

