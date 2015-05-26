package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class INV extends Segment {

    public E4501 e4501;
    public E7491 e7491;
    public E4499 e4499;
    public E4503 e4503;
    public C522 eC522;

    public INV() {
        this(false);
    }

    public INV(Boolean Mandatory) {
        super("INV", "INVENTORY MANAGEMENT RELATED DETAILS", "Function: To provide the different information related to the");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e4501, e7491, e4499, e4503, eC522}));
    }

}
