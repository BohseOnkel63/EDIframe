package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class AGR extends Segment {

    public C543 eC543;
    public E9419 e9419;

    public AGR() {
        this(false);
    }

    public AGR(Boolean Mandatory) {
        super("AGR", "AGREEMENT IDENTIFICATION", "Function: To specify the agreement details.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC543, e9419}));
    }

}
