package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class FII extends Segment {

    public E3035 e3035;
    public C078 eC078;
    public C088 eC088;
    public E3207 e3207;

    public FII() {
        this(false);
    }

    public FII(Boolean Mandatory) {
        super("FII", "FINANCIAL INSTITUTION INFORMATION", "Function: To identify an account and a related financial");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3035, eC078, eC088, e3207}));
        e3035.setMandatory(true);
    }

}
