package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C286 extends CompositeElement {
    public E1050 e1050 = new E1050();
    public E1159 e1159 = new E1159();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C286() {
        this(false, null, null, null, null);
    }


    public C286(Boolean Mandatory, String s1050, String s1159, String s1131, String s3055) {
        super("C286", "SEQUENCE INFORMATION", "Identification of a sequence and source for sequencing.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e1050, e1159, e1131, e3055}));
        e1050.setContent(s1050);
        e1050.setMandatory(true);
        e1159.setContent(s1159);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

