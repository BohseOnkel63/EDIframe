package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class MOA extends Segment {

    public C516 eC516;

    public MOA() {
        this(false);
    }

    public MOA(Boolean Mandatory) {
        super("MOA", "MONETARY AMOUNT", "Function: To specify a monetary amount.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC516}));
        eC516.setMandatory(true);
    }

}
