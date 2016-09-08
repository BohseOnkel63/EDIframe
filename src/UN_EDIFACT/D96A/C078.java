package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C078 extends CompositeElement {
    public E3194 e3194;
    public E3192 e3192_1;
    public E3192 e3192_2;
    public E6345 e6345;


    public C078() {
        this(false, null, null, null, null);
    }


    public C078(Boolean Mandatory, String s3194, String s3192_1, String s3192_2, String s6345) {
        super("C078", "ACCOUNT IDENTIFICATION", "Identification of an account holder by account number and/or account holder name in one or two lines. Number preferred.");
        this.setMandatory(Mandatory);
        e3194 = new E3194();
        e3192_1 = new E3192();
        e3192_2 = new E3192();
        e6345 = new E6345();
        e3194.setContent(s3194);
        e3192_1.setContent(s3192_1);
        e3192_2.setContent(s3192_2);
        e6345.setContent(s6345);
        addElement(e3194);
        addElement(e3192_1);
        addElement(e3192_2);
        addElement(e6345);
    }


}

