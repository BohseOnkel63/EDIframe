package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class IMD extends Segment {

    public E7077 e7077;
    public E7081 e7081;
    public C273 eC273;
    public E7383 e7383;

    public IMD() {
        this(false);
    }

    public IMD(Boolean Mandatory) {
        super("IMD", "ITEM DESCRIPTION", "Function: To describe an item in either an industry or free");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7077, e7081, eC273, e7383}));
    }

}
