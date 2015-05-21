package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C825 extends CompositeElement {
    public E7509 e7509 = new E7509();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7508 e7508 = new E7508();


    public C825() {
        this(false, null, null, null, null);
    }


    public C825(Boolean Mandatory, String s7509, String s1131, String s3055, String s7508) {
        super("C825", "DAMAGE SEVERITY", "To specify the severity of damage to an object.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7509, e1131, e3055, e7508}));
        e7509.setContent(s7509);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7508.setContent(s7508);
    }


}

