package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class EQN extends Segment {

    public C523 eC523;

    public EQN() {
        this(false);
    }

    public EQN(Boolean Mandatory) {
        super("EQN", "NUMBER OF UNITS", "Function: To specify the number of units.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC523}));
        eC523.setMandatory(true);
    }

}
