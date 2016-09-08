package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ERC extends Segment {

    public C901 eC901;

    public ERC() {
        this(false);
    }

    public ERC(Boolean Mandatory) {
        super("ERC", "APPLICATION ERROR INFORMATION", "Function: To identify the type of application error within a");
        this.setMandatory(Mandatory);
        eC901 = new C901();
        addElement(eC901);
        eC901.setMandatory(true);
    }

}
