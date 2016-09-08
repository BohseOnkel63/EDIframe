package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class APR extends Segment {

    public E4043 e4043;
    public C138 eC138;
    public C960 eC960;

    public APR() {
        this(false);
    }

    public APR(Boolean Mandatory) {
        super("APR", "ADDITIONAL PRICE INFORMATION", "Function: To provide information concerning pricing related to");
        this.setMandatory(Mandatory);
        e4043 = new E4043();
        eC138 = new C138();
        eC960 = new C960();
        addElement(e4043);
        addElement(eC138);
        addElement(eC960);
    }

}
