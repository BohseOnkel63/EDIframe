package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CNI extends Segment {

    public E1490 e1490;
    public C503 eC503;
    public E1312 e1312;

    public CNI() {
        this(false);
    }

    public CNI(Boolean Mandatory) {
        super("CNI", "CONSIGNMENT INFORMATION", "Function: To identify one consignment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1490, eC503, e1312}));
    }

}
