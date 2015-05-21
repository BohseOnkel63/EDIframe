package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C527 extends CompositeElement {
    public E6314 e6314 = new E6314();
    public E6411 e6411 = new E6411();
    public E6313 e6313 = new E6313();
    public E6321 e6321 = new E6321();


    public C527() {
        this(false, null, null, null, null);
    }


    public C527(Boolean Mandatory, String s6314, String s6411, String s6313, String s6321) {
        super("C527", "STATISTICAL DETAILS", "Specifications related to statistical measurements.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e6314, e6411, e6313, e6321}));
        e6314.setContent(s6314);
        e6411.setContent(s6411);
        e6313.setContent(s6313);
        e6321.setContent(s6321);
    }


}

