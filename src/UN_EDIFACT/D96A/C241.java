package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C241 extends CompositeElement {
    public E5153 e5153 = new E5153();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5152 e5152 = new E5152();


    public C241() {
        this(false, null, null, null, null);
    }


    public C241(Boolean Mandatory, String s5153, String s1131, String s3055, String s5152) {
        super("C241", "DUTY/TAX/FEE TYPE", "Code and/or name identifying duty, tax or fee.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5153, e1131, e3055, e5152}));
        e5153.setContent(s5153);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5152.setContent(s5152);
    }


}

