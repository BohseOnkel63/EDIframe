package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C502 extends CompositeElement {
    public E6313 e6313;
    public E6321 e6321;
    public E6155 e6155;
    public E6154 e6154;


    public C502() {
        this(false, null, null, null, null);
    }


    public C502(Boolean Mandatory, String s6313, String s6321, String s6155, String s6154) {
        super("C502", "MEASUREMENT DETAILS", "Identification of measurement type.");
        this.setMandatory(Mandatory);
        e6313 = new E6313();
        e6321 = new E6321();
        e6155 = new E6155();
        e6154 = new E6154();
        e6313.setContent(s6313);
        e6321.setContent(s6321);
        e6155.setContent(s6155);
        e6154.setContent(s6154);
        addElement(e6313);
        addElement(e6321);
        addElement(e6155);
        addElement(e6154);
    }


}

