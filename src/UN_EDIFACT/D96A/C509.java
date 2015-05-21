package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C509 extends CompositeElement {
    public E5125 e5125 = new E5125();
    public E5118 e5118 = new E5118();
    public E5375 e5375 = new E5375();
    public E5387 e5387 = new E5387();
    public E5284 e5284 = new E5284();
    public E6411 e6411 = new E6411();


    public C509() {
        this(false, null, null, null, null, null, null);
    }


    public C509(Boolean Mandatory, String s5125, String s5118, String s5375, String s5387, String s5284, String s6411) {
        super("C509", "PRICE INFORMATION", "Identification of price type, price and related details.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5125, e5118, e5375, e5387, e5284, e6411}));
        e5125.setContent(s5125);
        e5125.setMandatory(true);
        e5118.setContent(s5118);
        e5375.setContent(s5375);
        e5387.setContent(s5387);
        e5284.setContent(s5284);
        e6411.setContent(s6411);
    }


}

