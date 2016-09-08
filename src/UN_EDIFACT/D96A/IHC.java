package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class IHC extends Segment {

    public E3289 e3289;
    public C818 eC818;

    public IHC() {
        this(false);
    }

    public IHC(Boolean Mandatory) {
        super("IHC", "PERSON CHARACTERISTIC", "Function: To specify characteristics of a person such as ethnic");
        this.setMandatory(Mandatory);
        e3289 = new E3289();
        eC818 = new C818();
        addElement(e3289);
        addElement(eC818);
        e3289.setMandatory(true);
    }

}
