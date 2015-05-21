package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C205 extends CompositeElement {
    public E8351 e8351 = new E8351();
    public E8078 e8078 = new E8078();
    public E8092 e8092 = new E8092();


    public C205() {
        this(false, null, null, null);
    }


    public C205(Boolean Mandatory, String s8351, String s8078, String s8092) {
        super("C205", "HAZARD CODE", "The identification of the dangerous goods in code.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e8351, e8078, e8092}));
        e8351.setContent(s8351);
        e8351.setMandatory(true);
        e8078.setContent(s8078);
        e8092.setContent(s8092);
    }


}

