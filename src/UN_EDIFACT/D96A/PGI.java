package UN_EDIFACT.D96A;

import UN_EDIFACT.Segment;
import java.util.ArrayList;
import java.util.Arrays;

public class PGI extends Segment {

    public E5379 e5379;
    public C288 eC288;

    public PGI() {
        this(false);
    }

    public PGI(Boolean Mandatory) {
        super("PGI", "PRODUCT GROUP INFORMATION", "Function: To indicate the group in which a product belongs.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Object[]{e5379, eC288}));
        e5379.setMandatory(true);
    }

}
