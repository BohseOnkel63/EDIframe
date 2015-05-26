package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GIR extends Segment {

    public E7297 e7297;
    public C206 eC206_1;
    public C206 eC206_2;
    public C206 eC206_3;
    public C206 eC206_4;
    public C206 eC206_5;

    public GIR() {
        this(false);
    }

    public GIR(Boolean Mandatory) {
        super("GIR", "RELATED IDENTIFICATION NUMBERS", "Function: To specify a related set of identification numbers.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7297, eC206_1, eC206_2, eC206_3, eC206_4, eC206_5}));
        e7297.setMandatory(true);
        eC206_1.setMandatory(true);
    }

}
