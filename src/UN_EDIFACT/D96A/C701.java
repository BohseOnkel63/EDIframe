package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C701 extends CompositeElement {
    public E1049 e1049 = new E1049();
    public E1052 e1052 = new E1052();
    public E1054 e1054 = new E1054();


    public C701() {
        this(false, null, null, null);
    }


    public C701(Boolean Mandatory, String s1049, String s1052, String s1054) {
        super("C701", "ERROR POINT DETAILS", "Indication of the point of error in a message.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1049, e1052, e1054}));
        e1049.setContent(s1049);
        e1049.setMandatory(true);
        e1052.setContent(s1052);
        e1054.setContent(s1054);
    }


}

