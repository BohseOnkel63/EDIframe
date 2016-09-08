package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ATT extends Segment {

    public E9017 e9017;
    public C955 eC955;
    public C956 eC956;

    public ATT() {
        this(false);
    }

    public ATT(Boolean Mandatory) {
        super("ATT", "ATTRIBUTE", "Function: To identify a specific attribute.");
        this.setMandatory(Mandatory);
        e9017 = new E9017();
        eC955 = new C955();
        eC956 = new C956();
        addElement(e9017);
        addElement(eC955);
        addElement(eC956);
        e9017.setMandatory(true);
    }

}
