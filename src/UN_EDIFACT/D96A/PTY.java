package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PTY extends Segment {

    public E4035 e4035;
    public C585 eC585;

    public PTY() {
        this(false);
    }

    public PTY(Boolean Mandatory) {
        super("PTY", "PRIORITY", "Function: The segment is used to communicate priority");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4035, eC585}));
        e4035.setMandatory(true);
    }

}
