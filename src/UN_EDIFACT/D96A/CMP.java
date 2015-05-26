package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CMP extends Segment {

    public E9146 e9146;
    public E1507 e1507;
    public E4513 e4513;

    public CMP() {
        this(false);
    }

    public CMP(Boolean Mandatory) {
        super("CMP", "COMPOSITE DATA ELEMENT IDENTIFICATION", "Function: To identify a composite data element and to give its");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9146, e1507, e4513}));
        e9146.setMandatory(true);
    }

}
