package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C849 extends CompositeElement {
    public E3301 e3301 = new E3301();
    public E3285 e3285 = new E3285();


    public C849() {
        this(false, null, null);
    }


    public C849(Boolean Mandatory, String s3301, String s3285) {
        super("C849", "PARTIES TO INSTRUCTION", "Identify the sending and receiving parties of the instruction.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3301, e3285}));
        e3301.setContent(s3301);
        e3301.setMandatory(true);
        e3285.setContent(s3285);
    }


}

