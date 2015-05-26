package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class FCA extends Segment {

    public E4471 e4471;
    public C878 eC878;

    public FCA() {
        this(false);
    }

    public FCA(Boolean Mandatory) {
        super("FCA", "FINANCIAL CHARGES ALLOCATION", "Function: Description of allocation of charges.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4471, eC878}));
        e4471.setMandatory(true);
    }

}
