package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class DLI extends Segment {

    public E1073 e1073;
    public E1082 e1082;

    public DLI() {
        this(false);
    }

    public DLI(Boolean Mandatory) {
        super("DLI", "DOCUMENT LINE IDENTIFICATION", "Function: To specify the processing mode of a specific line");
        this.setMandatory(Mandatory);
        e1073 = new E1073();
        e1082 = new E1082();
        addElement(e1073);
        addElement(e1082);
        e1073.setMandatory(true);
        e1082.setMandatory(true);
    }

}
