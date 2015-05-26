package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SGP extends Segment {

    public C237 eC237;
    public E7224 e7224;

    public SGP() {
        this(false);
    }

    public SGP(Boolean Mandatory) {
        super("SGP", "SPLIT GOODS PLACEMENT", "Function: To specify the placement of goods in relation to");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC237, e7224}));
        eC237.setMandatory(true);
    }

}
