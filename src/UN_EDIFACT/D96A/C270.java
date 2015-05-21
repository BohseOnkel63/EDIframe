package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C270 extends CompositeElement {
    public E6069 e6069 = new E6069();
    public E6066 e6066 = new E6066();
    public E6411 e6411 = new E6411();


    public C270() {
        this(false, null, null, null);
    }


    public C270(Boolean Mandatory, String s6069, String s6066, String s6411) {
        super("C270", "CONTROL", "Control total for checking integrity of a message or part of a message.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e6069, e6066, e6411}));
        e6069.setContent(s6069);
        e6069.setMandatory(true);
        e6066.setContent(s6066);
        e6066.setMandatory(true);
        e6411.setContent(s6411);
    }


}

