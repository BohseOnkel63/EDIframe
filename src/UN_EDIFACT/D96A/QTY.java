package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class QTY extends Segment {

    public C186 eC186;

    public QTY() {
        this(false);
    }

    public QTY(Boolean Mandatory) {
        super("QTY", "QUANTITY", "Function: To specify a pertinent quantity.");
        this.setMandatory(Mandatory);
        eC186 = new C186();
        addElement(eC186);
        eC186.setMandatory(true);
    }

}
