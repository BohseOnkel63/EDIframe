package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C552 extends CompositeElement {
    public E1230 e1230 = new E1230();
    public E5189 e5189 = new E5189();


    public C552() {
        this(false, null, null);
    }


    public C552(Boolean Mandatory, String s1230, String s5189) {
        super("C552", "ALLOWANCE/CHARGE INFORMATION", "Identification of allowance/charge information by number and/or code.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1230, e5189}));
        e1230.setContent(s1230);
        e5189.setContent(s5189);
    }


}

