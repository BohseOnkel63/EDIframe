package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class QVR extends Segment {

    public C279 eC279;
    public E4221 e4221;
    public C960 eC960;

    public QVR() {
        this(false);
    }

    public QVR(Boolean Mandatory) {
        super("QVR", "QUANTITY VARIANCES", "Function: To specify item details relating to quantity");
        this.setMandatory(Mandatory);
        eC279 = new C279();
        e4221 = new E4221();
        eC960 = new C960();
        addElement(eC279);
        addElement(e4221);
        addElement(eC960);
    }

}
