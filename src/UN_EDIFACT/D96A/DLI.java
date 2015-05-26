package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DLI extends Segment {

    public E1073 e1073;
    public E1082 e1082;

    public DLI() {
        this(false);
    }

    public DLI(Boolean Mandatory) {
        super("DLI", "DOCUMENT LINE IDENTIFICATION", "Function: To specify the processing mode of a specific line");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1073, e1082}));
        e1073.setMandatory(true);
        e1082.setMandatory(true);
    }

}
