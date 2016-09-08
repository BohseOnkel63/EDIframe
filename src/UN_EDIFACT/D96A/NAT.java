package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class NAT extends Segment {

    public E3493 e3493;
    public C042 eC042;

    public NAT() {
        this(false);
    }

    public NAT(Boolean Mandatory) {
        super("NAT", "NATIONALITY", "Function: To specify a nationality.");
        this.setMandatory(Mandatory);
        e3493 = new E3493();
        eC042 = new C042();
        addElement(e3493);
        addElement(eC042);
        e3493.setMandatory(true);
    }

}
