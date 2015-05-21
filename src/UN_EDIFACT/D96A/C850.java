package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C850 extends CompositeElement {
    public E4405 e4405 = new E4405();
    public E3036 e3036 = new E3036();


    public C850() {
        this(false, null, null);
    }


    public C850(Boolean Mandatory, String s4405, String s3036) {
        super("C850", "STATUS OF INSTRUCTION", "Provides information regarding the status of an instruction.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4405, e3036}));
        e4405.setContent(s4405);
        e4405.setMandatory(true);
        e3036.setContent(s3036);
    }


}

