package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C279 extends CompositeElement {
    public E6064 e6064 = new E6064();
    public E6063 e6063 = new E6063();


    public C279() {
        this(false, null, null);
    }


    public C279(Boolean Mandatory, String s6064, String s6063) {
        super("C279", "QUANTITY DIFFERENCE INFORMATION", "Information on quantity difference.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e6064, e6063}));
        e6064.setContent(s6064);
        e6064.setMandatory(true);
        e6063.setContent(s6063);
    }


}

