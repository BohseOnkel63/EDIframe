package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class FTX extends Segment {

    public E4451 e4451;
    public E4453 e4453;
    public C107 eC107;
    public C108 eC108;
    public E3453 e3453;

    public FTX() {
        this(false);
    }

    public FTX(Boolean Mandatory) {
        super("FTX", "FREE TEXT", "Function: To provide free form or coded text information.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4451, e4453, eC107, eC108, e3453}));
        e4451.setMandatory(true);
    }

}
