package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C508 extends CompositeElement {
    public E3453 e3453;
    public E3452 e3452;


    public C508() {
        this(false, null, null);
    }


    public C508(Boolean Mandatory, String s3453, String s3452) {
        super("C508", "LANGUAGE DETAILS", "To identify a language.");
        this.setMandatory(Mandatory);
        e3453 = new E3453();
        e3452 = new E3452();
        e3453.setContent(s3453);
        e3452.setContent(s3452);
        addElement(e3453);
        addElement(e3452);
    }


}

