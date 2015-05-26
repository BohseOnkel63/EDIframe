package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class MSG extends Segment {

    public C709 eC709;
    public E1507 e1507;
    public E4513 e4513;

    public MSG() {
        this(false);
    }

    public MSG(Boolean Mandatory) {
        super("MSG", "MESSAGE TYPE IDENTIFICATION", "Function: To identify a message type and to give its class and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC709, e1507, e4513}));
        eC709.setMandatory(true);
    }

}
