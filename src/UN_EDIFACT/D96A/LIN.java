package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class LIN extends Segment {

    public E1082 e1082;
    public E1229 e1229;
    public C212 eC212;
    public C829 eC829;
    public E1222 e1222;
    public E7083 e7083;

    public LIN() {
        this(false);
    }

    public LIN(Boolean Mandatory) {
        super("LIN", "LINE ITEM", "Function: To identify a line item and configuration.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1082, e1229, eC212, eC829, e1222, e7083}));
    }

}
