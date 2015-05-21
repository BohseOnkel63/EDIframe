package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C537 extends CompositeElement {
    public E4219 e4219 = new E4219();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C537() {
        this(false, null, null, null);
    }


    public C537(Boolean Mandatory, String s4219, String s1131, String s3055) {
        super("C537", "TRANSPORT PRIORITY", "To indicate the priority of requested transport service.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4219, e1131, e3055}));
        e4219.setContent(s4219);
        e4219.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

