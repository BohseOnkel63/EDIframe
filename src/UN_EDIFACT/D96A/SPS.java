package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SPS extends Segment {

    public C526 eC526;
    public E6074 e6074;
    public C512 eC512_1;
    public C512 eC512_2;
    public C512 eC512_3;
    public C512 eC512_4;
    public C512 eC512_5;

    public SPS() {
        this(false);
    }

    public SPS(Boolean Mandatory) {
        super("SPS", "SAMPLING PARAMETERS FOR SUMMARY STATISTICS", "Function: To define the sampling parameters associated with");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC526, e6074, eC512_1, eC512_2, eC512_3, eC512_4, eC512_5}));
    }

}
