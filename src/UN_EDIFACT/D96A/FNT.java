package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class FNT extends Segment {

    public C784 eC784;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public FNT() {
        this(false);
    }

    public FNT(Boolean Mandatory) {
        super("FNT", "FOOTNOTE", "Function: To identify a footnote.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC784, eC082, e4405, e4513}));
        eC784.setMandatory(true);
    }

}
