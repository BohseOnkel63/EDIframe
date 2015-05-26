package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PCD extends Segment {

    public C501 eC501;

    public PCD() {
        this(false);
    }

    public PCD(Boolean Mandatory) {
        super("PCD", "PERCENTAGE DETAILS", "Function: To specify percentage information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC501}));
        eC501.setMandatory(true);
    }

}
