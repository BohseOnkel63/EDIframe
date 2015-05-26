package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TSR extends Segment {

    public C536 eC536;
    public C233 eC233;
    public C537 eC537;
    public C703 eC703;

    public TSR() {
        this(false);
    }

    public TSR(Boolean Mandatory) {
        super("TSR", "TRANSPORT SERVICE REQUIREMENTS", "Function: To specify the contract and carriage conditions and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC536, eC233, eC537, eC703}));
    }

}
