package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class EQA extends Segment {

    public E8053 e8053;
    public C237 eC237;

    public EQA() {
        this(false);
    }

    public EQA(Boolean Mandatory) {
        super("EQA", "ATTACHED EQUIPMENT", "Function: To specify attached or related equipment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e8053, eC237}));
        e8053.setMandatory(true);
    }

}
