package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class STC extends Segment {

    public C785 eC785;
    public C082 eC082;
    public E4405 e4405;
    public E4513 e4513;

    public STC() {
        this(false);
    }

    public STC(Boolean Mandatory) {
        super("STC", "STATISTICAL CONCEPT", "Function: To specify a statistical concept.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC785, eC082, e4405, e4513}));
        eC785.setMandatory(true);
    }

}
