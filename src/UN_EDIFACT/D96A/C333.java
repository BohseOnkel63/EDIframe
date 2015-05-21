package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C333 extends CompositeElement {
    public E4511 e4511 = new E4511();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E4510 e4510 = new E4510();


    public C333() {
        this(false, null, null, null, null);
    }


    public C333(Boolean Mandatory, String s4511, String s1131, String s3055, String s4510) {
        super("C333", "INFORMATION REQUEST", "To specify the information requested in a responding message.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4511, e1131, e3055, e4510}));
        e4511.setContent(s4511);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4510.setContent(s4510);
    }


}

