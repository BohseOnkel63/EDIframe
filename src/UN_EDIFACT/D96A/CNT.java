package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CNT extends Segment {

    public C270 eC270;

    public CNT() {
        this(false);
    }

    public CNT(Boolean Mandatory) {
        super("CNT", "CONTROL TOTAL", "Function: To provide control total.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC270}));
        eC270.setMandatory(true);
    }

}
