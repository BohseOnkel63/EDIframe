package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class COT extends Segment {

    public E5047 e5047;
    public C953 eC953;
    public C522 eC522;
    public C203 eC203;
    public C960 eC960;

    public COT() {
        this(false);
    }

    public COT(Boolean Mandatory) {
        super("COT", "CONTRIBUTION DETAILS", "Function: To specify details about membership contributions.");
        this.setMandatory(Mandatory);
        e5047 = new E5047();
        eC953 = new C953();
        eC522 = new C522();
        eC203 = new C203();
        eC960 = new C960();
        addElement(e5047);
        addElement(eC953);
        addElement(eC522);
        addElement(eC203);
        addElement(eC960);
        e5047.setMandatory(true);
    }

}
