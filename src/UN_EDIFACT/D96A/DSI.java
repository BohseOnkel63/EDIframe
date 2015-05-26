package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DSI extends Segment {

    public C782 eC782;
    public C082 eC082;
    public E4405 e4405;
    public C286 eC286;
    public E1060 e1060;

    public DSI() {
        this(false);
    }

    public DSI(Boolean Mandatory) {
        super("DSI", "DATA SET IDENTIFICATION", "Function: To identify a data set.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC782, eC082, e4405, eC286, e1060}));
        eC782.setMandatory(true);
    }

}
