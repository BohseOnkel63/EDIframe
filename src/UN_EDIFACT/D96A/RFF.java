package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class RFF extends Segment {

    public C506 eC506;

    public RFF() {
        this(false);
    }

    public RFF(Boolean Mandatory) {
        super("RFF", "REFERENCE", "Function: To specify a reference.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC506}));
        eC506.setMandatory(true);
    }

}
