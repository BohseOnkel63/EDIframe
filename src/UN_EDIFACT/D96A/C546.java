package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C546 extends CompositeElement {
    public E5030 e5030 = new E5030();
    public E5039 e5039 = new E5039();


    public C546() {
        this(false, null, null);
    }


    public C546(Boolean Mandatory, String s5030, String s5039) {
        super("C546", "INDEX VALUE", "To identify the value of an index.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5030, e5039}));
        e5030.setContent(s5030);
        e5030.setMandatory(true);
        e5039.setContent(s5039);
    }


}

