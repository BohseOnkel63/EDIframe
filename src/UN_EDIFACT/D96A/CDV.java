package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CDV extends Segment {

    public E9426 e9426;
    public E9434 e9434;
    public E4513 e4513;

    public CDV() {
        this(false);
    }

    public CDV(Boolean Mandatory) {
        super("CDV", "CODE VALUE DEFINITION", "Function: To provide information related to a code value.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9426, e9434, e4513}));
        e9426.setMandatory(true);
    }

}
