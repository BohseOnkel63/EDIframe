package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class STS extends Segment {

    public C601 eC601;
    public C555 eC555;
    public C556 eC556_1;
    public C556 eC556_2;
    public C556 eC556_3;
    public C556 eC556_4;
    public C556 eC556_5;

    public STS() {
        this(false);
    }

    public STS(Boolean Mandatory) {
        super("STS", "STATUS", "Function: To specify the type of industry sector/application to");
        this.setMandatory(Mandatory);
        eC601 = new C601();
        eC555 = new C555();
        eC556_1 = new C556();
        eC556_2 = new C556();
        eC556_3 = new C556();
        eC556_4 = new C556();
        eC556_5 = new C556();
        addElement(eC601);
        addElement(eC555);
        addElement(eC556_1);
        addElement(eC556_2);
        addElement(eC556_3);
        addElement(eC556_4);
        addElement(eC556_5);
    }

}
