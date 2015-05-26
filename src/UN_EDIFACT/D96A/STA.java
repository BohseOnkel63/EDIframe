package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class STA extends Segment {

    public E6331 e6331;
    public C527 eC527;

    public STA() {
        this(false);
    }

    public STA(Boolean Mandatory) {
        super("STA", "STATISTICS", "Function: To transmit summary statistics related to a specified");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e6331, eC527}));
        e6331.setMandatory(true);
    }

}
