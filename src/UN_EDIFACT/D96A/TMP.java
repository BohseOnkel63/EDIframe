package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TMP extends Segment {

    public E6245 e6245;
    public C239 eC239;

    public TMP() {
        this(false);
    }

    public TMP(Boolean Mandatory) {
        super("TMP", "TEMPERATURE", "Function: To specify the temperature setting.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e6245, eC239}));
        e6245.setMandatory(true);
    }

}
