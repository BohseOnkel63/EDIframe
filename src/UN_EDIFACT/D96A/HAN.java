package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class HAN extends Segment {

    public C524 eC524;
    public C218 eC218;

    public HAN() {
        this(false);
    }

    public HAN(Boolean Mandatory) {
        super("HAN", "HANDLING INSTRUCTIONS", "Function: To specify handling and where necessary, notify");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC524, eC218}));
    }

}
