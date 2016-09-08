package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class PAT extends Segment {

    public E4279 e4279;
    public C110 eC110;
    public C112 eC112;

    public PAT() {
        this(false);
    }

    public PAT(Boolean Mandatory) {
        super("PAT", "PAYMENT TERMS BASIS", "Function: To specify the payment terms basis.");
        this.setMandatory(Mandatory);
        e4279 = new E4279();
        eC110 = new C110();
        eC112 = new C112();
        addElement(e4279);
        addElement(eC110);
        addElement(eC112);
        e4279.setMandatory(true);
    }

}
