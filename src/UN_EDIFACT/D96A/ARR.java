package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ARR extends Segment {

    public C778 eC778;
    public C770 eC770;

    public ARR() {
        this(false);
    }

    public ARR(Boolean Mandatory) {
        super("ARR", "ARRAY INFORMATION", "Function: To contain the data in a array.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC778, eC770}));
    }

}
