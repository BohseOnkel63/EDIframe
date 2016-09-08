package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ERP extends Segment {

    public C701 eC701;

    public ERP() {
        this(false);
    }

    public ERP(Boolean Mandatory) {
        super("ERP", "ERROR POINT DETAILS", "Function: To identify the location and type of application error");
        this.setMandatory(Mandatory);
        eC701 = new C701();
        addElement(eC701);
        eC701.setMandatory(true);
    }

}
