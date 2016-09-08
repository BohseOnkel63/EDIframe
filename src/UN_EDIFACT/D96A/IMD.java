package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class IMD extends Segment {

    public E7077 e7077;
    public E7081 e7081;
    public C273 eC273;
    public E7383 e7383;

    public IMD() {
        this(false);
    }

    public IMD(Boolean Mandatory) {
        super("IMD", "ITEM DESCRIPTION", "Function: To describe an item in either an industry or free");
        this.setMandatory(Mandatory);
        e7077 = new E7077();
        e7081 = new E7081();
        eC273 = new C273();
        e7383 = new E7383();
        addElement(e7077);
        addElement(e7081);
        addElement(eC273);
        addElement(e7383);
    }

}
