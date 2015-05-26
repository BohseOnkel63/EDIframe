package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CPI extends Segment {

    public C229 eC229;
    public C231 eC231;
    public E4237 e4237;

    public CPI() {
        this(false);
    }

    public CPI(Boolean Mandatory) {
        super("CPI", "CHARGE PAYMENT INSTRUCTIONS", "Function: To identify a charge.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC229, eC231, e4237}));
    }

}
