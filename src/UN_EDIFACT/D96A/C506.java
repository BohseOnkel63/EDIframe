package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C506 extends CompositeElement {
    public E1153 e1153 = new E1153();
    public E1154 e1154 = new E1154();
    public E1156 e1156 = new E1156();
    public E4000 e4000 = new E4000();


    public C506() {
        this(false, null, null, null, null);
    }


    public C506(Boolean Mandatory, String s1153, String s1154, String s1156, String s4000) {
        super("C506", "REFERENCE", "Identification of a reference.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1153, e1154, e1156, e4000}));
        e1153.setContent(s1153);
        e1153.setMandatory(true);
        e1154.setContent(s1154);
        e1156.setContent(s1156);
        e4000.setContent(s4000);
    }


}

