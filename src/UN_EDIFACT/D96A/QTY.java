package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class QTY extends Segment {

    public C186 eC186;

    public QTY() {
        this(false);
    }

    public QTY(Boolean Mandatory) {
        super("QTY", "QUANTITY", "Function: To specify a pertinent quantity.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC186}));
        eC186.setMandatory(true);
    }

}
