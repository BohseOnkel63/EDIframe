package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PRC extends Segment {

    public C242 eC242;

    public PRC() {
        this(false);
    }

    public PRC(Boolean Mandatory) {
        super("PRC", "PROCESS IDENTIFICATION", "Function: To identify a process.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC242}));
        eC242.setMandatory(true);
    }

}
