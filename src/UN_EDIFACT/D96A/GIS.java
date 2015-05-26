package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GIS extends Segment {

    public C529 eC529;

    public GIS() {
        this(false);
    }

    public GIS(Boolean Mandatory) {
        super("GIS", "GENERAL INDICATOR", "Function: To transmit a processing indicator.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC529}));
        eC529.setMandatory(true);
    }

}
