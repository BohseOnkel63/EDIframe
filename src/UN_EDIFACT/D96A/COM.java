package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class COM extends Segment {

    public C076 eC076;

    public COM() {
        this(false);
    }

    public COM(Boolean Mandatory) {
        super("COM", "COMMUNICATION CONTACT", "Function: To identify a communication number of a department or");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC076}));
        eC076.setMandatory(true);
    }

}
