package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CPS extends Segment {

    public E7164 e7164;
    public E7166 e7166;
    public E7075 e7075;

    public CPS() {
        this(false);
    }

    public CPS(Boolean Mandatory) {
        super("CPS", "CONSIGNMENT PACKING SEQUENCE", "Function: To identify the sequence in which physical packing is");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7164, e7166, e7075}));
        e7164.setMandatory(true);
    }

}
