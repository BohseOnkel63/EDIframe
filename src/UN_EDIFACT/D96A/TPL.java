package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TPL extends Segment {

    public C222 eC222;

    public TPL() {
        this(false);
    }

    public TPL(Boolean Mandatory) {
        super("TPL", "TRANSPORT PLACEMENT", "Function: To specify placement of goods or equipment in relation");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC222}));
        eC222.setMandatory(true);
    }

}
