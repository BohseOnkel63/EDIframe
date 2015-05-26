package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class EQD extends Segment {

    public E8053 e8053;
    public C237 eC237;
    public C224 eC224;
    public E8077 e8077;
    public E8249 e8249;
    public E8169 e8169;

    public EQD() {
        this(false);
    }

    public EQD(Boolean Mandatory) {
        super("EQD", "EQUIPMENT DETAILS", "Function: To identify a unit of equipment.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e8053, eC237, eC224, e8077, e8249, e8169}));
        e8053.setMandatory(true);
    }

}
