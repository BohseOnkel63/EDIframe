package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C108 extends CompositeElement {
    public E4440 e4440_1 = new E4440();
    public E4440 e4440_2 = new E4440();
    public E4440 e4440_3 = new E4440();
    public E4440 e4440_4 = new E4440();
    public E4440 e4440_5 = new E4440();


    public C108() {
        this(false, null, null, null, null, null);
    }


    public C108(Boolean Mandatory, String s4440_1, String s4440_2, String s4440_3, String s4440_4, String s4440_5) {
        super("C108", "TEXT LITERAL", "Free text; one to five lines.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4440_1, e4440_2, e4440_3, e4440_4, e4440_5}));
        e4440_1.setContent(s4440_1);
        e4440_1.setMandatory(true);
        e4440_2.setContent(s4440_2);
        e4440_3.setContent(s4440_3);
        e4440_4.setContent(s4440_4);
        e4440_5.setContent(s4440_5);
    }


}

