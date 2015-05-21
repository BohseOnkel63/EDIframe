package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C235 extends CompositeElement {
    public E8158 e8158 = new E8158();
    public E8186 e8186 = new E8186();


    public C235() {
        this(false, null, null);
    }


    public C235(Boolean Mandatory, String s8158, String s8186) {
        super("C235", "HAZARD IDENTIFICATION", "Identification of the Orange placard required on the means of transport.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8158, e8186}));
        e8158.setContent(s8158);
        e8186.setContent(s8186);
    }


}

