package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PDI extends Segment {

    public E3499 e3499;
    public C085 eC085;
    public C101 eC101;

    public PDI() {
        this(false);
    }

    public PDI(Boolean Mandatory) {
        super("PDI", "PERSON DEMOGRAPHIC INFORMATION", "Function: To specify items of person demographic information.");
        this.setMandatory(Mandatory);
        e3499 = new E3499();
        eC085 = new C085();
        eC101 = new C101();
        addElement(e3499);
        addElement(eC085);
        addElement(eC101);
    }

}
