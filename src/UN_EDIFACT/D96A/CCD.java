package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CCD extends Segment {

    public E4505 e4505;
    public E4507 e4507;
    public E4509 e4509;

    public CCD() {
        this(false);
    }

    public CCD(Boolean Mandatory) {
        super("CCD", "CREDIT COVER DETAILS", "Function: To request a credit cover, reply to that request and");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4505, e4507, e4509}));
    }

}
