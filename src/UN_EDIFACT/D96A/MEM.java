package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class MEM extends Segment {

    public E7449 e7449;
    public C942 eC942;
    public C944 eC944;
    public C945 eC945;
    public C203 eC203;
    public C960 eC960;

    public MEM() {
        this(false);
    }

    public MEM(Boolean Mandatory) {
        super("MEM", "MEMBERSHIP DETAILS", "Function: To specify details about membership.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7449, eC942, eC944, eC945, eC203, eC960}));
        e7449.setMandatory(true);
    }

}
