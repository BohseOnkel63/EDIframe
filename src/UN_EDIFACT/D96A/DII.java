package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DII extends Segment {

    public E1056 e1056;
    public E1058 e1058;
    public E9148 e9148;
    public E1476 e1476;
    public E3453 e3453;
    public E4513 e4513;

    public DII() {
        this(false);
    }

    public DII(Boolean Mandatory) {
        super("DII", "DIRECTORY IDENTIFICATION", "Function: To identify a directory and to give its release,");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1056, e1058, e9148, e1476, e3453, e4513}));
        e1056.setMandatory(true);
        e1058.setMandatory(true);
    }

}
