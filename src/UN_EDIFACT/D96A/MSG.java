package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class MSG extends Segment {

    public C709 eC709;
    public E1507 e1507;
    public E4513 e4513;

    public MSG() {
        this(false);
    }

    public MSG(Boolean Mandatory) {
        super("MSG", "MESSAGE TYPE IDENTIFICATION", "Function: To identify a message type and to give its class and");
        this.setMandatory(Mandatory);
        eC709 = new C709();
        e1507 = new E1507();
        e4513 = new E4513();
        addElement(eC709);
        addElement(e1507);
        addElement(e4513);
        eC709.setMandatory(true);
    }

}
