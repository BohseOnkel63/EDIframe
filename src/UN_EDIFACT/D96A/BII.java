package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class BII extends Segment {

    public E7429 e7429;
    public C045 eC045;
    public E7140 e7140;

    public BII() {
        this(false);
    }

    public BII(Boolean Mandatory) {
        super("BII", "STRUCTURE IDENTIFICATION", "Function: A segment used to convey an indexing structure");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7429, eC045, e7140}));
        e7429.setMandatory(true);
        eC045.setMandatory(true);
    }

}
