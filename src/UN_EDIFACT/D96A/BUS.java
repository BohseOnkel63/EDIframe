package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class BUS extends Segment {

    public C521 eC521;
    public E3279 e3279;
    public E4487 e4487;
    public C551 eC551;
    public E4463 e4463;

    public BUS() {
        this(false);
    }

    public BUS(Boolean Mandatory) {
        super("BUS", "BUSINESS FUNCTION", "Function: To provide information related to the processing and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC521, e3279, e4487, eC551, e4463}));
    }

}
