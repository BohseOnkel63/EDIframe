package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C080 extends CompositeElement {
    public E3036 e3036_1 = new E3036();
    public E3036 e3036_2 = new E3036();
    public E3036 e3036_3 = new E3036();
    public E3036 e3036_4 = new E3036();
    public E3036 e3036_5 = new E3036();
    public E3045 e3045 = new E3045();


    public C080() {
        this(false, null, null, null, null, null, null);
    }


    public C080(Boolean Mandatory, String s3036_1, String s3036_2, String s3036_3, String s3036_4, String s3036_5, String s3045) {
        super("C080", "PARTY NAME", "Identification of a transaction party by name, one to five lines. Party name may be formatted.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3036_1, e3036_2, e3036_3, e3036_4, e3036_5, e3045}));
        e3036_1.setContent(s3036_1);
        e3036_1.setMandatory(true);
        e3036_2.setContent(s3036_2);
        e3036_3.setContent(s3036_3);
        e3036_4.setContent(s3036_4);
        e3036_5.setContent(s3036_5);
        e3045.setContent(s3045);
    }


}

