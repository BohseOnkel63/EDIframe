package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class INP extends Segment {

    public C849 eC849;
    public C522 eC522;
    public C850 eC850;
    public E1229 e1229;

    public INP() {
        this(false);
    }

    public INP(Boolean Mandatory) {
        super("INP", "PARTIES TO INSTRUCTION", "Function: To specify parties to an instruction and where");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC849, eC522, eC850, e1229}));
    }

}
