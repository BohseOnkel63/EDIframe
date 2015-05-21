package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C601 extends CompositeElement {
    public E9015 e9015 = new E9015();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C601() {
        this(false, null, null, null);
    }


    public C601(Boolean Mandatory, String s9015, String s1131, String s3055) {
        super("C601", "STATUS TYPE", "To specify the type of status in relation to an industry sector or business function.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9015, e1131, e3055}));
        e9015.setContent(s9015);
        e9015.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

