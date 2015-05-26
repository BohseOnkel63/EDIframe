package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SCC extends Segment {

    public E4017 e4017;
    public E4493 e4493;
    public C329 eC329;

    public SCC() {
        this(false);
    }

    public SCC(Boolean Mandatory) {
        super("SCC", "SCHEDULING CONDITIONS", "Function: To specify scheduling conditions.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4017, e4493, eC329}));
        e4017.setMandatory(true);
    }

}
