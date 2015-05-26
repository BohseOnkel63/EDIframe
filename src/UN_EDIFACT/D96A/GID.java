package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class GID extends Segment {

    public E1496 e1496;
    public C213 eC213_1;
    public C213 eC213_2;
    public C213 eC213_3;

    public GID() {
        this(false);
    }

    public GID(Boolean Mandatory) {
        super("GID", "GOODS ITEM DETAILS", "Function: To indicate totals of a goods item.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e1496, eC213_1, eC213_2, eC213_3}));
    }

}
