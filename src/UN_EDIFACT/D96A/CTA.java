package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class CTA extends Segment {

    public E3139 e3139;
    public C056 eC056;

    public CTA() {
        this(false);
    }

    public CTA(Boolean Mandatory) {
        super("CTA", "CONTACT INFORMATION", "Function: To identify a person or a department to whom");
        this.setMandatory(Mandatory);
        e3139 = new E3139();
        eC056 = new C056();
        addElement(e3139);
        addElement(eC056);
    }

}
