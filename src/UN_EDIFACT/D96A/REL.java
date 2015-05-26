package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class REL extends Segment {

    public E9141 e9141;
    public C941 eC941;

    public REL() {
        this(false);
    }

    public REL(Boolean Mandatory) {
        super("REL", "RELATIONSHIP", "Function: To identify the direct relationship between the");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9141, eC941}));
        e9141.setMandatory(true);
    }

}
