package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C556 extends CompositeElement {
    public E9013 e9013 = new E9013();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E9012 e9012 = new E9012();


    public C556() {
        this(false, null, null, null, null);
    }


    public C556(Boolean Mandatory, String s9013, String s1131, String s3055, String s9012) {
        super("C556", "STATUS REASON", "To specify the reason behind a status event.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e9013, e1131, e3055, e9012}));
        e9013.setContent(s9013);
        e9013.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e9012.setContent(s9012);
    }


}

