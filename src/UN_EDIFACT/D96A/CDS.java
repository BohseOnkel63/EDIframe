package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CDS extends Segment {

    public C702 eC702;
    public E1507 e1507;
    public E4513 e4513;

    public CDS() {
        this(false);
    }

    public CDS(Boolean Mandatory) {
        super("CDS", "CODE SET IDENTIFICATION", "Function: To identify a code set and to give its class and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC702, e1507, e4513}));
        eC702.setMandatory(true);
    }

}
