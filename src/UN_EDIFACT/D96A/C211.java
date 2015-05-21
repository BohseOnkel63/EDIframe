package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C211 extends CompositeElement {
    public E6411 e6411 = new E6411();
    public E6168 e6168 = new E6168();
    public E6140 e6140 = new E6140();
    public E6008 e6008 = new E6008();


    public C211() {
        this(false, null, null, null, null);
    }


    public C211(Boolean Mandatory, String s6411, String s6168, String s6140, String s6008) {
        super("C211", "DIMENSIONS", "Specification of the dimensions of a transportable unit.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e6411, e6168, e6140, e6008}));
        e6411.setContent(s6411);
        e6411.setMandatory(true);
        e6168.setContent(s6168);
        e6140.setContent(s6140);
        e6008.setContent(s6008);
    }


}

