package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GDS extends Segment {

    public C703 eC703;

    public GDS() {
        this(false);
    }

    public GDS(Boolean Mandatory) {
        super("GDS", "NATURE OF CARGO", "Function: To indicate the type of cargo as a general");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC703}));
    }

}
