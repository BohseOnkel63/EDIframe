package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DAM extends Segment {

    public E7493 e7493;
    public C821 eC821;
    public C822 eC822;
    public C825 eC825;
    public C826 eC826;

    public DAM() {
        this(false);
    }

    public DAM(Boolean Mandatory) {
        super("DAM", "DAMAGE", "Function: To specify damage including action taken.");
        this.setMandatory(Mandatory);
        e7493 = new E7493();
        eC821 = new C821();
        eC822 = new C822();
        eC825 = new C825();
        eC826 = new C826();
        addElement(e7493);
        addElement(eC821);
        addElement(eC822);
        addElement(eC825);
        addElement(eC826);
        e7493.setMandatory(true);
    }

}
