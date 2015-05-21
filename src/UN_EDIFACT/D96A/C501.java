package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C501 extends CompositeElement {
    public E5245 e5245 = new E5245();
    public E5482 e5482 = new E5482();
    public E5249 e5249 = new E5249();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C501() {
        this(false, null, null, null, null, null);
    }


    public C501(Boolean Mandatory, String s5245, String s5482, String s5249, String s1131, String s3055) {
        super("C501", "PERCENTAGE DETAILS", "Percentage relating to a specified basis.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5245, e5482, e5249, e1131, e3055}));
        e5245.setContent(s5245);
        e5245.setMandatory(true);
        e5482.setContent(s5482);
        e5249.setContent(s5249);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

