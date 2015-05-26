package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CST extends Segment {

    public E1496 e1496;
    public C246 eC246_1;
    public C246 eC246_2;
    public C246 eC246_3;
    public C246 eC246_4;
    public C246 eC246_5;

    public CST() {
        this(false);
    }

    public CST(Boolean Mandatory) {
        super("CST", "CUSTOMS STATUS OF GOODS", "Function: To specify goods in terms of customs identities,");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1496, eC246_1, eC246_2, eC246_3, eC246_4, eC246_5}));
    }

}
