package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PAT extends Segment {

    public E4279 e4279;
    public C110 eC110;
    public C112 eC112;

    public PAT() {
        this(false);
    }

    public PAT(Boolean Mandatory) {
        super("PAT", "PAYMENT TERMS BASIS", "Function: To specify the payment terms basis.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4279, eC110, eC112}));
        e4279.setMandatory(true);
    }

}
