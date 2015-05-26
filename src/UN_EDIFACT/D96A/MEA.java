package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class MEA extends Segment {

    public E6311 e6311;
    public C502 eC502;
    public C174 eC174;
    public E7383 e7383;

    public MEA() {
        this(false);
    }

    public MEA(Boolean Mandatory) {
        super("MEA", "MEASUREMENTS", "Function: To specify physical measurements, including dimension");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e6311, eC502, eC174, e7383}));
        e6311.setMandatory(true);
    }

}
