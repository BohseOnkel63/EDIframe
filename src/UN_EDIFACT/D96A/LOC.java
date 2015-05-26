package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class LOC extends Segment {

    public E3227 e3227;
    public C517 eC517;
    public C519 eC519;
    public C553 eC553;
    public E5479 e5479;

    public LOC() {
        this(false);
    }

    public LOC(Boolean Mandatory) {
        super("LOC", "PLACE/LOCATION IDENTIFICATION", "Function: To identify a country/place/location/related location");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e3227, eC517, eC519, eC553, e5479}));
        e3227.setMandatory(true);
    }

}
