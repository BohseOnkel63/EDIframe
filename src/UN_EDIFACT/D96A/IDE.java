package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class IDE extends Segment {

    public E7495 e7495;
    public C206 eC206;
    public C082 eC082;
    public E4405 e4405;
    public E1222 e1222;
    public C778 eC778;
    public C240 eC240;

    public IDE() {
        this(false);
    }

    public IDE(Boolean Mandatory) {
        super("IDE", "IDENTITY", "Function: To identify an object.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7495, eC206, eC082, e4405, e1222, eC778, eC240}));
        e7495.setMandatory(true);
        eC206.setMandatory(true);
    }

}
