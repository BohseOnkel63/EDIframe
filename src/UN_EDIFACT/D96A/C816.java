package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C816 extends CompositeElement {
    public E3405 e3405;
    public E3398 e3398;
    public E3401 e3401;
    public E3295 e3295;


    public C816() {
        this(false, null, null, null, null);
    }


    public C816(Boolean Mandatory, String s3405, String s3398, String s3401, String s3295) {
        super("C816", "NAME COMPONENT DETAILS", "To specify a name component.");
        this.setMandatory(Mandatory);
        e3405 = new E3405();
        e3398 = new E3398();
        e3401 = new E3401();
        e3295 = new E3295();
        e3405.setContent(s3405);
        e3405.setMandatory(true);
        e3398.setContent(s3398);
        e3401.setContent(s3401);
        e3295.setContent(s3295);
        addElement(e3405);
        addElement(e3398);
        addElement(e3401);
        addElement(e3295);
    }


}

