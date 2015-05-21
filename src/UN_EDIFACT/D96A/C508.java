package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C508 extends CompositeElement {
    public E3453 e3453 = new E3453();
    public E3452 e3452 = new E3452();


    public C508() {
        this(false, null, null);
    }


    public C508(Boolean Mandatory, String s3453, String s3452) {
        super("C508", "LANGUAGE DETAILS", "To identify a language.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3453, e3452}));
        e3453.setContent(s3453);
        e3452.setContent(s3452);
    }


}

