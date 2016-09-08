package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class LOC extends Segment {

    public E3227 e3227;
    public C517 eC517;
    public C519 eC519;
    public C553 eC553;
    public E5479 e5479;

    public LOC() {
        this(false);
    }

    public LOC(Boolean Mandatory) {
        super("LOC", "PLACE/LOCATION IDENTIFICATION", "Function: To identify a country/place/location/related location");
        this.setMandatory(Mandatory);
        e3227 = new E3227();
        eC517 = new C517();
        eC519 = new C519();
        eC553 = new C553();
        e5479 = new E5479();
        addElement(e3227);
        addElement(eC517);
        addElement(eC519);
        addElement(eC553);
        addElement(e5479);
        e3227.setMandatory(true);
    }

}
