package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class ICD extends Segment {

    public C330 eC330;
    public C331 eC331;

    public ICD() {
        this(false);
    }

    public ICD(Boolean Mandatory) {
        super("ICD", "INSURANCE COVER DESCRIPTION", "Function: To describe the insurance cover.");
        this.setMandatory(Mandatory);
        eC330 = new C330();
        eC331 = new C331();
        addElement(eC330);
        addElement(eC331);
        eC330.setMandatory(true);
        eC331.setMandatory(true);
    }

}
