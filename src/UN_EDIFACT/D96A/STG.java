package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class STG extends Segment {

    public E9421 e9421;
    public E6426 e6426;
    public E6428 e6428;

    public STG() {
        this(false);
    }

    public STG(Boolean Mandatory) {
        super("STG", "STAGES", "Function: To provide information related to the kind of stage in");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9421, e6426, e6428}));
        e9421.setMandatory(true);
    }

}
