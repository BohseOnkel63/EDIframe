package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class INP extends Segment {

    public C849 eC849;
    public C522 eC522;
    public C850 eC850;
    public E1229 e1229;

    public INP() {
        this(false);
    }

    public INP(Boolean Mandatory) {
        super("INP", "PARTIES TO INSTRUCTION", "Function: To specify parties to an instruction and where");
        this.setMandatory(Mandatory);
        eC849 = new C849();
        eC522 = new C522();
        eC850 = new C850();
        e1229 = new E1229();
        addElement(eC849);
        addElement(eC522);
        addElement(eC850);
        addElement(e1229);
    }

}
