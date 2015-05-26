package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DIM extends Segment {

    public E6145 e6145;
    public C211 eC211;

    public DIM() {
        this(false);
    }

    public DIM(Boolean Mandatory) {
        super("DIM", "DIMENSIONS", "Function: To specify dimensions.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e6145, eC211}));
        e6145.setMandatory(true);
        eC211.setMandatory(true);
    }

}
