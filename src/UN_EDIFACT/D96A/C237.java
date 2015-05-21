package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C237 extends CompositeElement {
    public E8260 e8260 = new E8260();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3207 e3207 = new E3207();


    public C237() {
        this(false, null, null, null, null);
    }


    public C237(Boolean Mandatory, String s8260, String s1131, String s3055, String s3207) {
        super("C237", "EQUIPMENT IDENTIFICATION", "Marks (letters and/or numbers) identifying equipment used for transport such as a container.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8260, e1131, e3055, e3207}));
        e8260.setContent(s8260);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3207.setContent(s3207);
    }


}

