package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class EMP extends Segment {

    public E9003 e9003;
    public C948 eC948;
    public C951 eC951;
    public C950 eC950;
    public E3494 e3494;
    public E9035 e9035;

    public EMP() {
        this(false);
    }

    public EMP(Boolean Mandatory) {
        super("EMP", "EMPLOYMENT DETAILS", "Function: To specify employment details.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9003, eC948, eC951, eC950, e3494, e9035}));
        e9003.setMandatory(true);
    }

}
