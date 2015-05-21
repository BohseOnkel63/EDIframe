package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C818 extends CompositeElement {
    public E3311 e3311 = new E3311();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3310 e3310 = new E3310();


    public C818() {
        this(false, null, null, null, null);
    }


    public C818(Boolean Mandatory, String s3311, String s1131, String s3055, String s3310) {
        super("C818", "PERSON INHERITED CHARACTERISTIC DETAILS", "To specify an inherited characteristic of a person.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3311, e1131, e3055, e3310}));
        e3311.setContent(s3311);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3310.setContent(s3310);
    }


}

