package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class AJT extends Segment {

    public E4465 e4465;
    public E1082 e1082;

    public AJT() {
        this(false);
    }

    public AJT(Boolean Mandatory) {
        super("AJT", "ADJUSTMENT DETAILS", "Function: To identify the reason for an adjustment.");
        this.setMandatory(Mandatory);
        e4465 = new E4465();
        e1082 = new E1082();
        addElement(e4465);
        addElement(e1082);
        e4465.setMandatory(true);
    }

}
