package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PAC extends Segment {

    public E7224 e7224;
    public C531 eC531;
    public C202 eC202;
    public C402 eC402;
    public C532 eC532;

    public PAC() {
        this(false);
    }

    public PAC(Boolean Mandatory) {
        super("PAC", "PACKAGE", "Function: To describe the number and type of packages/physical");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7224, eC531, eC202, eC402, eC532}));
    }

}
