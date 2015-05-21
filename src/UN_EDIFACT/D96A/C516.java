package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C516 extends CompositeElement {
    public E5025 e5025 = new E5025();
    public E5004 e5004 = new E5004();
    public E6345 e6345 = new E6345();
    public E6343 e6343 = new E6343();
    public E4405 e4405 = new E4405();


    public C516() {
        this(false, null, null, null, null, null);
    }


    public C516(Boolean Mandatory, String s5025, String s5004, String s6345, String s6343, String s4405) {
        super("C516", "MONETARY AMOUNT", "Amount of goods or services stated as a monetary amount in a specified currency.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5025, e5004, e6345, e6343, e4405}));
        e5025.setContent(s5025);
        e5025.setMandatory(true);
        e5004.setContent(s5004);
        e6345.setContent(s6345);
        e6343.setContent(s6343);
        e4405.setContent(s4405);
    }


}

