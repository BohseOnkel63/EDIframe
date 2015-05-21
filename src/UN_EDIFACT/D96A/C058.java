package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C058 extends CompositeElement {
    public E3124 e3124_1 = new E3124();
    public E3124 e3124_2 = new E3124();
    public E3124 e3124_3 = new E3124();
    public E3124 e3124_4 = new E3124();
    public E3124 e3124_5 = new E3124();


    public C058() {
        this(false, null, null, null, null, null);
    }


    public C058(Boolean Mandatory, String s3124_1, String s3124_2, String s3124_3, String s3124_4, String s3124_5) {
        super("C058", "NAME AND ADDRESS", "Unstructured name and address: one to five lines.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3124_1, e3124_2, e3124_3, e3124_4, e3124_5}));
        e3124_1.setContent(s3124_1);
        e3124_1.setMandatory(true);
        e3124_2.setContent(s3124_2);
        e3124_3.setContent(s3124_3);
        e3124_4.setContent(s3124_4);
        e3124_5.setContent(s3124_5);
    }


}

