package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class TOD extends Segment {

    public E4055 e4055;
    public E4215 e4215;
    public C100 eC100;

    public TOD() {
        this(false);
    }

    public TOD(Boolean Mandatory) {
        super("TOD", "TERMS OF DELIVERY OR TRANSPORT", "Function: To specify terms of delivery or transport.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4055, e4215, eC100}));
    }

}
