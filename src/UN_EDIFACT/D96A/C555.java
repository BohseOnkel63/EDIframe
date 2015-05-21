package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C555 extends CompositeElement {
    public E9011 e9011 = new E9011();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9010 e9010 = new E9010();


    public C555() {
        this(false, null, null, null, null);
    }


    public C555(Boolean Mandatory, String s9011, String s1131, String s3055, String s9010) {
        super("C555", "STATUS EVENT", "To specify a status event.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9011, e1131, e3055, e9010}));
        e9011.setContent(s9011);
        e9011.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9010.setContent(s9010);
    }


}

