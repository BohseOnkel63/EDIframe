package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C402 extends CompositeElement {
    public E7077 e7077 = new E7077();
    public E7064 e7064 = new E7064();
    public E7143 e7143 = new E7143();
    public E7064 e7064_1 = new E7064();
    public E7143 e7143_1 = new E7143();


    public C402() {
        this(false, null, null, null, null, null);
    }


    public C402(Boolean Mandatory, String s7077, String s7064, String s7143, String s7064_1, String s7143_1) {
        super("C402", "PACKAGE TYPE IDENTIFICATION", "Identification of the form in which goods are described.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7077, e7064, e7143, e7064_1, e7143_1}));
        e7077.setContent(s7077);
        e7077.setMandatory(true);
        e7064.setContent(s7064);
        e7064.setMandatory(true);
        e7143.setContent(s7143);
        e7064_1.setContent(s7064_1);
        e7143_1.setContent(s7143_1);
    }


}

