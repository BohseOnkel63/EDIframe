package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C236 extends CompositeElement {
    public E8246 e8246_1 = new E8246();
    public E8246 e8246_2 = new E8246();
    public E8246 e8246_3 = new E8246();


    public C236() {
        this(false, null, null, null);
    }


    public C236(Boolean Mandatory, String s8246_1, String s8246_2, String s8246_3) {
        super("C236", "DANGEROUS GOODS LABEL", "Markings identifying the type of hazardous goods and similar information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8246_1, e8246_2, e8246_3}));
        e8246_1.setContent(s8246_1);
        e8246_2.setContent(s8246_2);
        e8246_3.setContent(s8246_3);
    }


}

