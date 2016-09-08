package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class SCC extends Segment {

    public E4017 e4017;
    public E4493 e4493;
    public C329 eC329;

    public SCC() {
        this(false);
    }

    public SCC(Boolean Mandatory) {
        super("SCC", "SCHEDULING CONDITIONS", "Function: To specify scheduling conditions.");
        this.setMandatory(Mandatory);
        e4017 = new E4017();
        e4493 = new E4493();
        eC329 = new C329();
        addElement(e4017);
        addElement(e4493);
        addElement(eC329);
        e4017.setMandatory(true);
    }

}
