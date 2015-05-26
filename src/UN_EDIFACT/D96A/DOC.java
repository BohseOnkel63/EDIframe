package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class DOC extends Segment {

    public C002 eC002;
    public C503 eC503;
    public E3153 e3153;
    public E1220 e1220;
    public E1218 e1218;

    public DOC() {
        this(false);
    }

    public DOC(Boolean Mandatory) {
        super("DOC", "DOCUMENT/MESSAGE DETAILS", "Function: To identify documents, either printed, electronically");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC002, eC503, e3153, e1220, e1218}));
        eC002.setMandatory(true);
    }

}
