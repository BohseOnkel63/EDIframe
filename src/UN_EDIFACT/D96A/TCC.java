package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TCC extends Segment {

    public C200 eC200;
    public C203 eC203;
    public C528 eC528;
    public C554 eC554;

    public TCC() {
        this(false);
    }

    public TCC(Boolean Mandatory) {
        super("TCC", "TRANSPORT CHARGE/RATE CALCULATIONS", "Function: To specify charges.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC200, eC203, eC528, eC554}));
    }

}
