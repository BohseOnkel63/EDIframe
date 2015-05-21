package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C223 extends CompositeElement {
    public E7106 e7106 = new E7106();
    public E6411 e6411 = new E6411();


    public C223() {
        this(false, null, null);
    }


    public C223(Boolean Mandatory, String s7106, String s6411) {
        super("C223", "DANGEROUS GOODS SHIPMENT FLASHPOINT", "Temperature at which a vapor according to ISO 1523/73 can be ignited.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7106, e6411}));
        e7106.setContent(s7106);
        e6411.setContent(s6411);
    }


}

