package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class IND extends Segment {

    public C545 eC545;
    public C546 eC546;

    public IND() {
        this(false);
    }

    public IND(Boolean Mandatory) {
        super("IND", "INDEX DETAILS", "Function: To specify an index.");
        this.setMandatory(Mandatory);
        eC545 = new C545();
        eC546 = new C546();
        addElement(eC545);
        addElement(eC546);
    }

}
