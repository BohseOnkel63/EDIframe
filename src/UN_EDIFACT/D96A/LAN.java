package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class LAN extends Segment {

    public E3455 e3455;
    public C508 eC508;

    public LAN() {
        this(false);
    }

    public LAN(Boolean Mandatory) {
        super("LAN", "LANGUAGE", "Function: To specify a language.");
        this.setMandatory(Mandatory);
        e3455 = new E3455();
        eC508 = new C508();
        addElement(e3455);
        addElement(eC508);
        e3455.setMandatory(true);
    }

}
