package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C817 extends CompositeElement {
    public E3299 e3299 = new E3299();
    public E3131 e3131 = new E3131();
    public E3475 e3475 = new E3475();


    public C817() {
        this(false, null, null, null);
    }


    public C817(Boolean Mandatory, String s3299, String s3131, String s3475) {
        super("C817", "ADDRESS USAGE", "To describe the usage of an address.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3299, e3131, e3475}));
        e3299.setContent(s3299);
        e3131.setContent(s3131);
        e3475.setContent(s3475);
    }


}

