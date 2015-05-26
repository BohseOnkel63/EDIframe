package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class SEL extends Segment {

    public E9308 e9308;
    public C215 eC215;
    public E4517 e4517;

    public SEL() {
        this(false);
    }

    public SEL(Boolean Mandatory) {
        super("SEL", "SEAL NUMBER", "Function: To specify a seal number related to equipment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e9308, eC215, e4517}));
        e9308.setMandatory(true);
    }

}
