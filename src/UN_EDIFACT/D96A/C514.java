package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C514 extends CompositeElement {
    public E3237 e3237;
    public E3236 e3236;


    public C514() {
        this(false, null, null);
    }


    public C514(Boolean Mandatory, String s3237, String s3236) {
        super("C514", "SAMPLE LOCATION DETAILS", "Identification of location within the specimen, from which the sample was taken.");
        this.setMandatory(Mandatory);
        e3237 = new E3237();
        e3236 = new E3236();
        e3237.setContent(s3237);
        e3236.setContent(s3236);
        addElement(e3237);
        addElement(e3236);
    }


}

