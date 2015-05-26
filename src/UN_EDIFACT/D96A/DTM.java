package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DTM extends Segment {

    public C507 eC507;

    public DTM() {
        this(false);
    }

    public DTM(Boolean Mandatory) {
        super("DTM", "DATE/TIME/PERIOD", "Function: To specify date, and/or time, or period.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC507}));
        eC507.setMandatory(true);
    }

}
