package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C232 extends CompositeElement {
    public E9415 e9415;
    public E9411 e9411;
    public E9417 e9417;
    public E9353 e9353;


    public C232() {
        this(false, null, null, null, null);
    }


    public C232(Boolean Mandatory, String s9415, String s9411, String s9417, String s9353) {
        super("C232", "GOVERNMENT ACTION", "Code indicating a type of government action.");
        this.setMandatory(Mandatory);
        e9415 = new E9415();
        e9411 = new E9411();
        e9417 = new E9417();
        e9353 = new E9353();
        e9415.setContent(s9415);
        e9411.setContent(s9411);
        e9417.setContent(s9417);
        e9353.setContent(s9353);
        addElement(e9415);
        addElement(e9411);
        addElement(e9417);
        addElement(e9353);
    }


}

