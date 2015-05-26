package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ASI extends Segment {

    public C779 eC779;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public ASI() {
        this(false);
    }

    public ASI(Boolean Mandatory) {
        super("ASI", "ARRAY STRUCTURE IDENTIFICATION", "Function: To identify the structure of an array.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC779, eC082, e4405, e4513}));
        eC779.setMandatory(true);
    }

}
