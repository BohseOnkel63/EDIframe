package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C551 extends CompositeElement {
    public E4383 e4383 = new E4383();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();


    public C551() {
        this(false, null, null, null);
    }


    public C551(Boolean Mandatory, String s4383, String s1131, String s3055) {
        super("C551", "BANK OPERATION", "Identification of a bank operation by code.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e4383, e1131, e3055}));
        e4383.setContent(s4383);
        e4383.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
    }


}

