package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C228 extends CompositeElement {
    public E8179 e8179 = new E8179();
    public E8178 e8178 = new E8178();


    public C228() {
        this(false, null, null);
    }


    public C228(Boolean Mandatory, String s8179, String s8178) {
        super("C228", "TRANSPORT MEANS", "Code and/or name identifying the type of means of transport.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8179, e8178}));
        e8179.setContent(s8179);
        e8178.setContent(s8178);
    }


}

