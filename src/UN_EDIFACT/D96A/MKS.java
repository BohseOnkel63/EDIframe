package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class MKS extends Segment {

    public E7293 e7293;
    public C332 eC332;
    public E1229 e1229;

    public MKS() {
        this(false);
    }

    public MKS(Boolean Mandatory) {
        super("MKS", "MARKET/SALES CHANNEL INFORMATION", "Function: To specify to which market and/or through which sales");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7293, eC332, e1229}));
        e7293.setMandatory(true);
        eC332.setMandatory(true);
    }

}
