package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class AJT extends Segment {

    public E4465 e4465;
    public E1082 e1082;

    public AJT() {
        this(false);
    }

    public AJT(Boolean Mandatory) {
        super("AJT", "ADJUSTMENT DETAILS", "Function: To identify the reason for an adjustment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4465, e1082}));
        e4465.setMandatory(true);
    }

}
