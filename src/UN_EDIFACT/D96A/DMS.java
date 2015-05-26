package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DMS extends Segment {

    public E1004 e1004;
    public E1001 e1001;
    public E7240 e7240;

    public DMS() {
        this(false);
    }

    public DMS(Boolean Mandatory) {
        super("DMS", "DOCUMENT/MESSAGE SUMMARY", "Function: To specify summary information relating to the");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1004, e1001, e7240}));
    }

}
