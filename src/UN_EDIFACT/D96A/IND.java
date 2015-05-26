package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class IND extends Segment {

    public C545 eC545;
    public C546 eC546;

    public IND() {
        this(false);
    }

    public IND(Boolean Mandatory) {
        super("IND", "INDEX DETAILS", "Function: To specify an index.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC545, eC546}));
    }

}
