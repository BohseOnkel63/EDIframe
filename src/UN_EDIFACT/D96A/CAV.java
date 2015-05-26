package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CAV extends Segment {

    public C889 eC889;

    public CAV() {
        this(false);
    }

    public CAV(Boolean Mandatory) {
        super("CAV", "CHARACTERISTIC VALUE", "Function: To provide the value of a characteristic.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC889}));
        eC889.setMandatory(true);
    }

}
