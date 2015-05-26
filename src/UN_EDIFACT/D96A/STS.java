package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class STS extends Segment {

    public C601 eC601;
    public C555 eC555;
    public C556 eC556_1;
    public C556 eC556_2;
    public C556 eC556_3;
    public C556 eC556_4;
    public C556 eC556_5;

    public STS() {
        this(false);
    }

    public STS(Boolean Mandatory) {
        super("STS", "STATUS", "Function: To specify the type of industry sector/application to");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC601, eC555, eC556_1, eC556_2, eC556_3, eC556_4, eC556_5}));
    }

}
