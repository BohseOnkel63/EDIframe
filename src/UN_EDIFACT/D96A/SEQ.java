package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SEQ extends Segment {

    public E1245 e1245;
    public C286 eC286;

    public SEQ() {
        this(false);
    }

    public SEQ(Boolean Mandatory) {
        super("SEQ", "SEQUENCE DETAILS", "Function: To provide specific details related to the delivery");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1245, eC286}));
    }

}
