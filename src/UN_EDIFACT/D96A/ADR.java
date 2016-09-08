package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ADR extends Segment {

    public C817 eC817;
    public C090 eC090;
    public E3164 e3164;
    public E3251 e3251;
    public E3207 e3207;
    public C819 eC819;
    public C517 eC517;

    public ADR() {
        this(false);
    }

    public ADR(Boolean Mandatory) {
        super("ADR", "ADDRESS", "Function: To specify an address.");
        this.setMandatory(Mandatory);
        eC817 = new C817();
        eC090 = new C090();
        e3164 = new E3164();
        e3251 = new E3251();
        e3207 = new E3207();
        eC819 = new C819();
        eC517 = new C517();
        addElement(eC817);
        addElement(eC090);
        addElement(e3164);
        addElement(e3251);
        addElement(e3207);
        addElement(eC819);
        addElement(eC517);
    }

}
