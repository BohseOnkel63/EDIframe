package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class TMP extends Segment {

    public E6245 e6245;
    public C239 eC239;

    public TMP() {
        this(false);
    }

    public TMP(Boolean Mandatory) {
        super("TMP", "TEMPERATURE", "Function: To specify the temperature setting.");
        this.setMandatory(Mandatory);
        e6245 = new E6245();
        eC239 = new C239();
        addElement(e6245);
        addElement(eC239);
        e6245.setMandatory(true);
    }

}
