package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DLM extends Segment {

    public E4455 e4455;
    public C522 eC522;
    public C214 eC214;
    public E4457 e4457;

    public DLM() {
        this(false);
    }

    public DLM(Boolean Mandatory) {
        super("DLM", "DELIVERY LIMITATIONS", "Function: To specify limitations on deliveries.");
        this.setMandatory(Mandatory);
        e4455 = new E4455();
        eC522 = new C522();
        eC214 = new C214();
        e4457 = new E4457();
        addElement(e4455);
        addElement(eC522);
        addElement(eC214);
        addElement(e4457);
    }

}
