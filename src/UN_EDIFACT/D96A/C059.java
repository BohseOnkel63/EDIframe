package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C059 extends CompositeElement {
    public E3042 e3042_1 = new E3042();
    public E3042 e3042_2 = new E3042();
    public E3042 e3042_3 = new E3042();
    public E3042 e3042_4 = new E3042();


    public C059() {
        this(false, null, null, null, null);
    }


    public C059(Boolean Mandatory, String s3042_1, String s3042_2, String s3042_3, String s3042_4) {
        super("C059", "STREET", "Street address and/or PO Box number in a structured address: one to three lines.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3042_1, e3042_2, e3042_3, e3042_4}));
        e3042_1.setContent(s3042_1);
        e3042_1.setMandatory(true);
        e3042_2.setContent(s3042_2);
        e3042_3.setContent(s3042_3);
        e3042_4.setContent(s3042_4);
    }


}

