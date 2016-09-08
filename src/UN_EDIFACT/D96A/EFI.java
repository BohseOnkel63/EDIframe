package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class EFI extends Segment {

    public C077 eC077;
    public C099 eC099;
    public E1050 e1050;

    public EFI() {
        this(false);
    }

    public EFI(Boolean Mandatory) {
        super("EFI", "EXTERNAL FILE LINK IDENTIFICATION", "Function: To specify the link of one non-EDIFACT external file");
        this.setMandatory(Mandatory);
        eC077 = new C077();
        eC099 = new C099();
        e1050 = new E1050();
        addElement(eC077);
        addElement(eC099);
        addElement(e1050);
        eC077.setMandatory(true);
    }

}
