package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SEQ extends Segment {

    public E1245 e1245;
    public C286 eC286;

    public SEQ() {
        this(false);
    }

    public SEQ(Boolean Mandatory) {
        super("SEQ", "SEQUENCE DETAILS", "Function: To provide specific details related to the delivery");
        this.setMandatory(Mandatory);
        e1245 = new E1245();
        eC286 = new C286();
        addElement(e1245);
        addElement(eC286);
    }

}
