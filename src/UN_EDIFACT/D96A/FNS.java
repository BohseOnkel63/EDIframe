package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class FNS extends Segment {

    public C783 eC783;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public FNS() {
        this(false);
    }

    public FNS(Boolean Mandatory) {
        super("FNS", "FOOTNOTE SET", "Function: To identify a set of footnotes.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC783, eC082, e4405, e4513}));
        eC783.setMandatory(true);
    }

}
