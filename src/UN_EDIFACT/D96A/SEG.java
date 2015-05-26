package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SEG extends Segment {

    public E9166 e9166;
    public E1507 e1507;
    public E4513 e4513;

    public SEG() {
        this(false);
    }

    public SEG(Boolean Mandatory) {
        super("SEG", "SEGMENT IDENTIFICATION", "Function: To identify a segment and give its class and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9166, e1507, e4513}));
        e9166.setMandatory(true);
    }

}
