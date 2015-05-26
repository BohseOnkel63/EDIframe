package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class RCS extends Segment {

    public E7293 e7293;
    public C550 eC550;
    public E1229 e1229;

    public RCS() {
        this(false);
    }

    public RCS(Boolean Mandatory) {
        super("RCS", "REQUIREMENTS AND CONDITIONS", "Function: To specify sector/subject requirements and conditions.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7293, eC550, e1229}));
        e7293.setMandatory(true);
    }

}
