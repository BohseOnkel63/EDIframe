package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C770 extends CompositeElement {
    public E9424 e9424 = new E9424();


    public C770() {
        this(false, null);
    }


    public C770(Boolean Mandatory, String s9424) {
        super("C770", "ARRAY CELL DETAILS", "To contain the data for a contiguous set of cells in an array.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9424}));
        e9424.setContent(s9424);
    }


}

