package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class BUS extends Segment {

    public C521 eC521;
    public E3279 e3279;
    public E4487 e4487;
    public C551 eC551;
    public E4463 e4463;

    public BUS() {
        this(false);
    }

    public BUS(Boolean Mandatory) {
        super("BUS", "BUSINESS FUNCTION", "Function: To provide information related to the processing and");
        this.setMandatory(Mandatory);
        eC521 = new C521();
        e3279 = new E3279();
        e4487 = new E4487();
        eC551 = new C551();
        e4463 = new E4463();
        addElement(eC521);
        addElement(e3279);
        addElement(e4487);
        addElement(eC551);
        addElement(e4463);
    }

}
