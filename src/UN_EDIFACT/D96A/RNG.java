package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class RNG extends Segment {

    public E6167 e6167;
    public C280 eC280;

    public RNG() {
        this(false);
    }

    public RNG(Boolean Mandatory) {
        super("RNG", "RANGE DETAILS", "Function: To identify a range.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e6167, eC280}));
        e6167.setMandatory(true);
    }

}
