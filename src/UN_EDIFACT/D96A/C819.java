package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C819 extends CompositeElement {
    public E3229 e3229 = new E3229();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3228 e3228 = new E3228();


    public C819() {
        this(false, null, null, null, null);
    }


    public C819(Boolean Mandatory, String s3229, String s1131, String s3055, String s3228) {
        super("C819", "COUNTRY SUB-ENTITY DETAILS", "To specify a part of a country (eg county or part of a city).");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3229, e1131, e3055, e3228}));
        e3229.setContent(s3229);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3228.setContent(s3228);
    }


}

