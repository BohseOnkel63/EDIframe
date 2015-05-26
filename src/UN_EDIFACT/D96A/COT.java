package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class COT extends Segment {

    public E5047 e5047;
    public C953 eC953;
    public C522 eC522;
    public C203 eC203;
    public C960 eC960;

    public COT() {
        this(false);
    }

    public COT(Boolean Mandatory) {
        super("COT", "CONTRIBUTION DETAILS", "Function: To specify details about membership contributions.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e5047, eC953, eC522, eC203, eC960}));
        e5047.setMandatory(true);
    }

}
