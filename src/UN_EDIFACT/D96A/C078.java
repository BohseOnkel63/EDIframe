package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C078 extends CompositeElement {
    public E3194 e3194 = new E3194();
    public E3192 e3192_1 = new E3192();
    public E3192 e3192_2 = new E3192();
    public E6345 e6345 = new E6345();


    public C078() {
        this(false, null, null, null, null);
    }


    public C078(Boolean Mandatory, String s3194, String s3192_1, String s3192_2, String s6345) {
        super("C078", "ACCOUNT IDENTIFICATION", "Identification of an account holder by account number and/or account holder name in one or two lines. Number preferred.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3194, e3192_1, e3192_2, e6345}));
        e3194.setContent(s3194);
        e3192_1.setContent(s3192_1);
        e3192_2.setContent(s3192_2);
        e6345.setContent(s6345);
    }


}

