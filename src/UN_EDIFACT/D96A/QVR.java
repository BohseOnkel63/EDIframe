package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class QVR extends Segment {

    public C279 eC279;
    public E4221 e4221;
    public C960 eC960;

    public QVR() {
        this(false);
    }

    public QVR(Boolean Mandatory) {
        super("QVR", "QUANTITY VARIANCES", "Function: To specify item details relating to quantity");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{eC279, e4221, eC960}));
    }

}
