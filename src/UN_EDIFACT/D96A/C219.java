package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C219 extends CompositeElement {
    public E8335 e8335 = new E8335();
    public E8334 e8334 = new E8334();


    public C219() {
        this(false, null, null);
    }


    public C219(Boolean Mandatory, String s8335, String s8334) {
        super("C219", "MOVEMENT TYPE", "Description of type of service for movement of cargo.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8335, e8334}));
        e8335.setContent(s8335);
        e8334.setContent(s8334);
    }


}

