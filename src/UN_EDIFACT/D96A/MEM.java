package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class MEM extends Segment {

    public E7449 e7449;
    public C942 eC942;
    public C944 eC944;
    public C945 eC945;
    public C203 eC203;
    public C960 eC960;

    public MEM() {
        this(false);
    }

    public MEM(Boolean Mandatory) {
        super("MEM", "MEMBERSHIP DETAILS", "Function: To specify details about membership.");
        this.setMandatory(Mandatory);
        e7449 = new E7449();
        eC942 = new C942();
        eC944 = new C944();
        eC945 = new C945();
        eC203 = new C203();
        eC960 = new C960();
        addElement(e7449);
        addElement(eC942);
        addElement(eC944);
        addElement(eC945);
        addElement(eC203);
        addElement(eC960);
        e7449.setMandatory(true);
    }

}
