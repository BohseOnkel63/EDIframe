package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class STG extends Segment {

    public E9421 e9421;
    public E6426 e6426;
    public E6428 e6428;

    public STG() {
        this(false);
    }

    public STG(Boolean Mandatory) {
        super("STG", "STAGES", "Function: To provide information related to the kind of stage in");
        this.setMandatory(Mandatory);
        e9421 = new E9421();
        e6426 = new E6426();
        e6428 = new E6428();
        addElement(e9421);
        addElement(e6426);
        addElement(e6428);
        e9421.setMandatory(true);
    }

}
