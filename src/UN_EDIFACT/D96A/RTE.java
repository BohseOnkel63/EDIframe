package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class RTE extends Segment {

    public C128 eC128;

    public RTE() {
        this(false);
    }

    public RTE(Boolean Mandatory) {
        super("RTE", "RATE DETAILS", "Function: To specify rate information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC128}));
        eC128.setMandatory(true);
    }

}
