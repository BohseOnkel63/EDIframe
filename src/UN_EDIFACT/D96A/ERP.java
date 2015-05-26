package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ERP extends Segment {

    public C701 eC701;

    public ERP() {
        this(false);
    }

    public ERP(Boolean Mandatory) {
        super("ERP", "ERROR POINT DETAILS", "Function: To identify the location and type of application error");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC701}));
        eC701.setMandatory(true);
    }

}
