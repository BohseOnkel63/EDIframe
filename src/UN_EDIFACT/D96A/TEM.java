package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TEM extends Segment {

    public C244 eC244;
    public E4419 e4419;
    public E3077 e3077;
    public E6311 e6311;
    public E7188 e7188;
    public C515 eC515;
    public C219 eC219;
    public E8332 e8332;
    public E8341 e8341;

    public TEM() {
        this(false);
    }

    public TEM(Boolean Mandatory) {
        super("TEM", "TEST METHOD", "Function: To describe the nature of the test performed.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC244, e4419, e3077, e6311, e7188, eC515, eC219, e8332, e8341}));
    }

}
