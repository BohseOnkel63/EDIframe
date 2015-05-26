package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class ATT extends Segment {

    public E9017 e9017;
    public C955 eC955;
    public C956 eC956;

    public ATT() {
        this(false);
    }

    public ATT(Boolean Mandatory) {
        super("ATT", "ATTRIBUTE", "Function: To identify a specific attribute.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9017, eC955, eC956}));
        e9017.setMandatory(true);
    }

}
