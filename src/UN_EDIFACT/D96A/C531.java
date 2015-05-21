package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C531 extends CompositeElement {
    public E7075 e7075 = new E7075();
    public E7233 e7233 = new E7233();
    public E7073 e7073 = new E7073();


    public C531() {
        this(false, null, null, null);
    }


    public C531(Boolean Mandatory, String s7075, String s7233, String s7073) {
        super("C531", "PACKAGING DETAILS", "Packaging level and details, terms and conditions.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7075, e7233, e7073}));
        e7075.setContent(s7075);
        e7233.setContent(s7233);
        e7073.setContent(s7073);
    }


}

