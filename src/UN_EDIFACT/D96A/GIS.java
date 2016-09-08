package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;


public class GIS extends Segment {

    public C529 eC529;

    public GIS() {
        this(false);
    }

    public GIS(Boolean Mandatory) {
        super("GIS", "GENERAL INDICATOR", "Function: To transmit a processing indicator.");
        this.setMandatory(Mandatory);
        eC529 = new C529();
        addElement(eC529);
        eC529.setMandatory(true);
    }

}
