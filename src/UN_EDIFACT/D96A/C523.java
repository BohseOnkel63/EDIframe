package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C523 extends CompositeElement {
    public E6350 e6350 = new E6350();
    public E6353 e6353 = new E6353();


    public C523() {
        this(false, null, null);
    }


    public C523(Boolean Mandatory, String s6350, String s6353) {
        super("C523", "NUMBER OF UNIT DETAILS", "Identification of number of units and its purpose.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e6350, e6353}));
        e6350.setContent(s6350);
        e6353.setContent(s6353);
    }


}

