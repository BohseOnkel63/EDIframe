package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GOR extends Segment {

    public E8323 e8323;
    public C232 eC232_1;
    public C232 eC232_2;
    public C232 eC232_3;
    public C232 eC232_4;

    public GOR() {
        this(false);
    }

    public GOR(Boolean Mandatory) {
        super("GOR", "GOVERNMENTAL REQUIREMENTS", "Function: To indicate the requirement for a specific govermental");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e8323, eC232_1, eC232_2, eC232_3, eC232_4}));
    }

}
