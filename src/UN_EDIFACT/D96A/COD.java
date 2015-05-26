package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class COD extends Segment {

    public C823 eC823;
    public C824 eC824;

    public COD() {
        this(false);
    }

    public COD(Boolean Mandatory) {
        super("COD", "COMPONENT DETAILS", "Function: To provide component details of an object (e.g.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC823, eC824}));
    }

}
