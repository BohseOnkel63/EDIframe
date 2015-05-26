package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class CCI extends Segment {

    public E7059 e7059;
    public C502 eC502;
    public C240 eC240;
    public E7001 e7001;
    public C564 eC564;

    public CCI() {
        this(false);
    }

    public CCI(Boolean Mandatory) {
        super("CCI", "CHARACTERISTIC/CLASS ID", "Function: To describe a physical or logical state.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e7059, eC502, eC240, e7001, eC564}));
        e7001.setMandatory(true);
        eC564.setMandatory(true);
    }

}
